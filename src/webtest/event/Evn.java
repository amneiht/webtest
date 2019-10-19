package webtest.event;

import java.util.Arrays;

public class Evn {
	static String[] ss = { "abort", "afterprint", "animationend", "animationiteration", "animationstart", "beforeprint",
			"beforeunload", "blur", "canplay", "canplaythrough", "change", "click", "contextmenu", "copy", "cut",
			"dblclick", "drag", "dragend", "dragenter", "dragleave", "dragover", "dragstart", "drop", "durationchange",
			"ended", "error", "focus", "focusin", "focusout", "fullscreenchange", "fullscreenerror", "hashchange",
			"input", "invalid", "keydown", "keypress", "keyup", "load", "loadeddata", "loadedmetadata", "loadstart",
			"message", "mousedown", "mouseenter", "mouseleave", "mousemove", "mouseover", "mouseout", "mouseup",
			"mousewheel", "offline", "online", "open", "pagehide", "pageshow", "paste", "pause", "play", "playing",
			"popstate", "progress", "ratechange", "resize", "reset", "scroll", "search", "seeked", "seeking", "select",
			"show", "stalled", "storage", "submit", "suspend", "timeupdate", "toggle", "touchcancel", "touchend",
			"touchmove", "touchstart", "transitionend", "unload", "volumechange", "waiting", "wheel" };

	public static boolean match(String s) {
		return Arrays.asList(ss).contains(s.trim());
	}
}
