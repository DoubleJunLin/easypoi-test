package com.test.easypoi;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import cn.afterturn.easypoi.entity.ImageEntity;
import cn.afterturn.easypoi.word.WordExportUtil;
import cn.afterturn.easypoi.word.entity.params.ExcelListEntity;

import com.test.easypoi.entity.Person;
import com.test.easypoi.entity.PersonEducations;
import com.test.easypoi.entity.PersonWorkExperiences;
import com.test.easypoi.util.StringUtilPoi;

/**
 * 
 * @author linjj
 * 生成人才word简历模板
 */
public class ResumeTemplate2 {
	
	public static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	
	private final static String bootPath = "D:/workspace/poi/src/main/java/";

	public static void main(String[] args) {
		
		String name = "金XX";
		Map<String,Object> map = new HashMap<String, Object>();
        
        // 包装人基本信息
        Person person = new Person();
        // 处理下字符串长度问题，便于word对齐
        person.setName(StringUtilPoi.getLengthStr("金XX",15));
        person.setAge(StringUtilPoi.getLengthStr(StringUtilPoi.nullTransToBlank("30"),15));
        person.setSex(StringUtilPoi.getLengthStr("男",15));
        person.setOrigin(StringUtilPoi.getLengthStr("浙江杭州",15));
        person.setTel(StringUtilPoi.getLengthStr("138XXXXXXXX",13));
        person.setDistrict(StringUtilPoi.getLengthStr("杭州市",11));
        person.setEmail(StringUtilPoi.nullTransToBlank("jinxxx@gmail.com"));
        person.setAcademTitle(StringUtilPoi.getLengthStr("硕士",11));
        person.setAddress(StringUtilPoi.nullTransToBlank("杭州市滨江区"));
        person.setJobInfo("算法工程师");
        map.put("p", person);
        map.put("academFileds", "计算机、金融");
        
        // 图片参数
        ImageEntity image = new ImageEntity();
		image.setHeight(150);
		image.setWidth(120);
		String filePath = "com/test/easypoi/images/"+StringUtilPoi.relpaceSpecialSign(person.getName(),"",".")+".jpg";
		// 绝对路径
		File file = new File(bootPath+filePath);
		if (file.exists()) {
			image.setUrl(filePath);
			image.setType(ImageEntity.URL);
			map.put("image", image);
		} else{
			// 不存在
			image.setUrl("com/test/easypoi/images/default.png");
			image.setType(ImageEntity.URL);
			map.put("image", image);
		}
        
        // 教育信息
        List<PersonEducations> eduList = new ArrayList<PersonEducations>();
        PersonEducations edu1 = new PersonEducations();
        edu1.setTimeSolt("2005.09~2008.06");
        edu1.setSclname("XX中学");
        edu1.setMajor("理科");
        edu1.setDegree("高中");
        eduList.add(edu1);
        PersonEducations edu2 = new PersonEducations();
        edu2.setTimeSolt("2008.09~2012.06");
        edu2.setSclname("XXX大学");
        edu2.setMajor("XXX");
        edu2.setDegree("本科");
        eduList.add(edu2);
        PersonEducations edu3 = new PersonEducations();
        edu3.setTimeSolt("2012.09~2015.06");
        edu3.setSclname("XXX大学");
        edu3.setMajor("XXX");
        edu3.setDegree("研究生");
        eduList.add(edu3);
        
        // 工作经历
        List<PersonWorkExperiences> workList = new ArrayList<PersonWorkExperiences>();
        PersonWorkExperiences work1 = new PersonWorkExperiences();
        work1.setTimeSolt("2015.07~20XX.XX");
        work1.setComname("XXXX");
        work1.setPosition("XXXX工程师");
        work1.setSimpleinfo("XXXX");
        workList.add(work1);
        PersonWorkExperiences work2 = new PersonWorkExperiences();
        work2.setTimeSolt("2015.07~20XX.XX");
        work2.setComname("XXXX");
        work2.setPosition("XXX工程师");
        work2.setSimpleinfo("XXXX");
        workList.add(work2);
        
        
        ExcelListEntity workExclelist = new ExcelListEntity(workList, PersonWorkExperiences.class);
        ExcelListEntity eduExclelist = new ExcelListEntity(eduList, PersonEducations.class);

        map.put("worklist", workExclelist);
        map.put("edulist", eduExclelist);

        try {
            XWPFDocument doc = WordExportUtil.exportWord07(
                    "D:/workspace/easy-poi-test/src/main/java/com/test/easypoi/doc/resume_template.docx", map);
            FileOutputStream fos = new FileOutputStream("D:/test/resume_"+name+".docx");
            doc.write(fos);
            fos.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
}
