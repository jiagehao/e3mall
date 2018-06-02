package cn.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品管理Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */

	@Controller
	public class PageController {

		@RequestMapping("/")
		public String showIndex() {
			return "index";
		}
		
		@RequestMapping("/{page}")
		public String showPage(@PathVariable String page) {
			return page;
		}
	}
