package com.pactera.entity.product;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * date : 2018-09-26 15:36:23
 * author : mapper generator
 * description : 附件表
 * 
 **/
@Data
public class Accessories implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	**/
	private Integer id;

	private MultipartFile file;

	/**
	 * 文件类型
	**/
	private String documentType;

	/**
	 * 文件名称
	**/
	private String fileName;

	private String filePath;

	/**
	 * 创建人
	**/
	private String founder;

	/**
	 * 上传时间
	**/
	private Date uploadTime;

	/**
	 * 文件大小
	**/
	private Double fileSize;

	/**
	 * 附件说明
	**/
	private String attachmentShows;

	private Integer productCode;

	/**
	 * 状态(0不显示，1显示)
	**/
	private Integer status;








}