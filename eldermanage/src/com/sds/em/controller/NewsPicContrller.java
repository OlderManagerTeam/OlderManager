package com.sds.em.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sds.em.po.Message;
import com.sds.em.pojo.UpLoadFile;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("v1/common")
public class NewsPicContrller {
	
	@RequestMapping("/uploadImg")
	public @ResponseBody UpLoadFile uploadImg(MultipartFile file, HttpServletRequest request) {
		UpLoadFile upLoadFile = new UpLoadFile();

		List<String> list = new ArrayList<String>();
		String pic_path = "E:\\oldermanageresource\\newspic\\";
		String picUrl = "http://localhost:8080/newspic/";
		// String path =
		// request.getSession().getServletContext().getRealPath(realPath);

		String name = file.getOriginalFilename();
		String pix = name.substring(name.lastIndexOf("."));
		String fileName = new Date().getTime() + pix;

		list.add(picUrl + fileName);
		upLoadFile.setData(list);
		File file1 = new File(pic_path + fileName);
		if (!file1.exists()) {
			file1.mkdirs();
		}
		try {
			file.transferTo(file1);
			upLoadFile.setErrno(0);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//String data = "{data:['" + list + "']}";
		//JSONObject jsonObject=JSONObject.fromObject(upLoadFile);
		
		//System.out.println("AAAAAAAAAAAAAAAA"+jsonObject.toString());
		return upLoadFile;
	}
}
