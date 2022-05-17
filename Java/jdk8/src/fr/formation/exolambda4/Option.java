package fr.formation.exolambda4;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Option<T> {
    private T element;

    public Option(T element) {
        this.element = element;
    }

    public T get() {
        return this.element;
    }

    public T orElse(Supplier<T> supply) {
        if (this.element != null) {
            return this.element;
        }

        return supply.get();
    }

    public <E extends Exception> T orElseThrow(Supplier<? extends E> exceptionSupply) throws E {
        if (this.element != null) {
            return this.element;
        }

        else {
            throw exceptionSupply.get();
        }
    }

    public Option<T> filter(Predicate<T> predicate) {
        if (this.element == null) {
            return this;
        }

        return predicate.test(this.element) ? this : new Option<>(null);
    }

    public void ifPresentOrElse(Consumer<T> onPresent, Runnable onElse) {
        if (this.element != null) {
            onPresent.accept(this.element);
        }

        else {
            onElse.run();
        }
    }
}
