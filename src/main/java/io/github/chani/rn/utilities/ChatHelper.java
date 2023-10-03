package io.github.chani.rn.utilities;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;

public class ChatHelper
{
	public static final Style SUCCESS = Style.style(TextColor.color(119, 238, 165), TextDecoration.BOLD);
	public static final Style ERROR   = Style.style(TextColor.color(238, 119, 119), TextDecoration.BOLD);
	public static final Style WARN    = Style.style(TextColor.color(238, 208, 119), TextDecoration.BOLD);
	public static final Style BALANCE = Style.style(TextColor.color(240, 240, 143), TextDecoration.BOLD);

	private static TextComponent getText(String initialMessage, Style style, String message)
	{
		return Component.text()
		                .append(Component.text(initialMessage, style))
		                .append(Component.text(message))
		                .build();
	}

	public static TextComponent success(String message)
	{
		return getText(" [SUCCESS] -> ", SUCCESS, message);
	}

	public static TextComponent error(String message)
	{
		return getText(" [ERROR] -> ", ERROR, message);
	}

	public static TextComponent warn(String message)
	{
		return getText(" [WARN] -> ", WARN, message);
	}

	public static TextComponent balance(String message)
	{
		return getText(" [BALANCE] -> ", BALANCE, message);
	}
}
