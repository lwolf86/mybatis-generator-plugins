package yongfa365.mybatis.generator.Utils;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.config.Context;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ContextUtils {

    public static Path getXmlPath(Context context) {
        Path path = Paths.get(
                context.getSqlMapGeneratorConfiguration().getTargetProject().replace(".", "/"),
                context.getSqlMapGeneratorConfiguration().getTargetPackage().replace(".", "/"));
        return path;
    }

    public static Path getModelPath(Context context) {
        Path path = Paths.get(
                context.getJavaModelGeneratorConfiguration().getTargetProject().replace(".", "/"),
                context.getJavaModelGeneratorConfiguration().getTargetPackage().replace(".", "/"));
        return path;
    }

    public static Path getDaoPath(Context context) {
        Path path = Paths.get(
                context.getJavaClientGeneratorConfiguration().getTargetProject().replace(".", "/"),
                context.getJavaClientGeneratorConfiguration().getTargetPackage().replace(".", "/"));
        return path;
    }

    public static String getDaoFileName(IntrospectedTable introspectedTable) {
        String filename = introspectedTable.getMyBatis3XmlMapperFileName();
        filename = filename.replace(".xml", ".java");
        return filename;
    }
}
