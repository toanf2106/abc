package com.example.student.controller;

import com.example.student.model.HocSinh;
import com.example.student.repository.hocSinhRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HsController {

  @Autowired
  hocSinhRepo hocSinhRepo;

@GetMapping("/oki")
public String oki(Model model) {
  model.addAttribute("hocSinh", new HocSinh());
  return "oki";
}
  @GetMapping("/hien_thi")
  public String hienThi(Model model, @ModelAttribute HocSinh hocSinh) {
    model.addAttribute("list", hocSinhRepo.findAll());
    return "/view_hs.html";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute("hocSinh") HocSinh hocSinh) {
    hocSinhRepo.save(hocSinh);
    return "redirect:/hien_thi";
  }


  @GetMapping("/hoc-sinh/delete/{id}")
  public String delete(@PathVariable("id") Integer id) {
    hocSinhRepo.deleteById(id);
    return "redirect:/hien_thi";

  }

  @GetMapping("/hoc-sinh/detail/{id}")
  public String detail(@PathVariable("id") Integer id, Model model) {
    HocSinh hocSinh = hocSinhRepo.findById(id).get();
    model.addAttribute("hocSinh", hocSinh);
    return "/hoc-sinh/detail.html";

  }
}
