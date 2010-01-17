package cn.benjamin.loxia.web.taglib.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.benjamin.loxia.web.taglib.annotation.LoxiaTag;

import com.opensymphony.xwork2.util.ValueStack;

@LoxiaTag(name="edittable", tldTagClass="cn.benjamin.loxia.web.taglib.tag.EditTableTag", description="Render an HTML Table element")
public class EditTable extends Table {
	
	/**
     * The name of the default template for the Loxia TableTag
     */
	final public static String OPEN_TEMPLATE = "loxia_edittable";
    
	public EditTable(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }
    
	@Override
	public String getDefaultOpenTemplate() {
		return OPEN_TEMPLATE;
	}
}