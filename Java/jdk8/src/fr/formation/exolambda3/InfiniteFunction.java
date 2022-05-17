package fr.formation.exolambda3;

@FunctionalInterface
public interface InfiniteFunction<T> {
    public T apply(Object... args);
}
