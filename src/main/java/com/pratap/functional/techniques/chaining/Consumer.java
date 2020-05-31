package com.pratap.functional.techniques.chaining;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {

	void accept(T t);

	default Consumer<T> thenApply(Consumer<T> next) {
		
		Objects.requireNonNull(next);
		return (T t) -> {
		
			this.accept(t);
			next.accept(t);
			
		};
	}
}
