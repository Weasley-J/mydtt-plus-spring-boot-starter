package cn.alphahub.dtt.plus.framework.core;

/**
 * DTT Context
 *
 * @author weasley
 * @version 1.0
 * @date 2022/7/13
 * @since 1.0
 */
public interface DttContext<T> {
    /**
     * Parse fully qualified class name to data table structure model
     *
     * @param fullyQualifiedClassName fully qualified class name of model
     * @return Data table structure model
     */
    default ParseFactory<T> parse(String fullyQualifiedClassName) {
        return null;
    }

    /**
     * Build create table statement
     *
     * @param model Data Model Analysis Results
     * @return table statement
     */
    default String create(ParseFactory<T> model) {
        return null;
    }
}
