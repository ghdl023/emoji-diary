package com.usopp.ediary.controller;

import com.usopp.ediary.model.Contents;
import com.usopp.ediary.service.ContentsService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/contents")
@RequiredArgsConstructor
public class ContentsController {

    private final ContentsService contentsService;

    @GetMapping("")
    public String contents(Model model) {
        List<Contents> list = contentsService.selectAllContents();
        model.addAttribute("list", list);

        return "contents-list";
    }

    @GetMapping("/add")
    public String add() {
        return "contents-add";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam(name="id") Long id, Model model) {
        System.out.println(id);
        Contents contents = contentsService.selectContentsById(id);

        model.addAttribute("contents", contents);

        return "contents-edit";
    }

    @PostMapping("")
    public String addContents(HttpServletRequest httpServletRequest){
        String title = httpServletRequest.getParameter("title");
        String content = httpServletRequest.getParameter("content");
        String emotion = httpServletRequest.getParameter("emotion");
        String weather = httpServletRequest.getParameter("weather");
        String withs = httpServletRequest.getParameter("withs");

        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Contents contents = Contents.builder()
                .title(title)
                .content(content)
                .emotionId(emotion)
                .weatherId(weather)
                .withsId(withs)
                .writer(1L)
                .yyyymmdd(simpleDateFormat.format(nowDate))
                .build();

        contentsService.insertContents(contents);

        return "redirect:/contents";
    }

    @PutMapping("")
    public String editContents(HttpServletRequest httpServletRequest) {
        System.out.println("dial");
        Long id = Long.parseLong(httpServletRequest.getParameter("id"));
        String title = httpServletRequest.getParameter("title");
        String content = httpServletRequest.getParameter("content");
        String emotion = httpServletRequest.getParameter("emotion");
        String weather = httpServletRequest.getParameter("weather");
        String withs = httpServletRequest.getParameter("withs");

        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Contents contents = Contents.builder()
                .id(id)
                .title(title)
                .content(content)
                .emotionId(emotion)
                .weatherId(weather)
                .withsId(withs)
                .writer(1L)
                .yyyymmdd(simpleDateFormat.format(nowDate))
                .build();

        contentsService.updateContents(contents);

        return "redirect:/contents";
    }

    @DeleteMapping("")
    public String deleteContents(@RequestParam(name="id") String id) {
        contentsService.deleteContents(Long.parseLong(id));
        return "redirect:/contents";
    }
}
