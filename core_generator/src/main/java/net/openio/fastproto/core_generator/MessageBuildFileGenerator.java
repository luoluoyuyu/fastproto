package net.openio.fastproto.core_generator;

import net.openio.fastproto.wrapper.Filed;
import net.openio.fastproto.wrapper.Meta;

import java.io.PrintWriter;
import java.util.Map;

public class MessageBuildFileGenerator {


    Filed filed;

    public MessageBuildFileGenerator(Filed filed) {
        this.filed = filed;
    }

    public void generate(PrintWriter pw, Map<String, Meta> metaMap) {

        pw.format("    private %s %s;\n", Util.getJavaType(filed, metaMap), filed.getFiledName());

    }
}