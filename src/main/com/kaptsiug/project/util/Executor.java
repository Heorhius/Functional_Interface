package main.com.kaptsiug.project.util;

@FunctionalInterface
public interface Executor<T> {
    T execute(T t);
}
