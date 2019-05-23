package com.jt.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by CGB on 2019/3/10.
 */
public class DateJsonSerializer extends JsonSerializer<Date>{
    /**
     * FAQ
     *这个方法何时调用?将对象转换为JSON串时,假如在对象的对应的
     * GET方法上,使用了@JsonSerializer(usering=DateJsonSerizalizer.class)
     * 2.这个方法中的参数时什么含义?
     * @param value 要转换的对象
     * @param gen json数据装换器
     * @param serializers 序列化提供者
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        //定义一个日期格式转换器
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //装换日期对象
        String format = sdf.format(value);
        //将此字符创写到json串中
        gen.writeString(format);
    }
}
