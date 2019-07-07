package io.github.pseudoresonance.pseudoapi.bukkit.utils;

public class ElementBuilder {

	private ChatElement[] elements;

	public ElementBuilder(ChatElement... chatElements) {
		elements = chatElements;
	}

	public ChatElement[] build() {
		return elements;
	}

}