package com.dynatrace.agent.userinteraction.model;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class TouchAction {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ TouchAction[] $VALUES;
    public static final TouchAction DOWN = new TouchAction("DOWN", 0);
    public static final TouchAction UP = new TouchAction("UP", 1);
    public static final TouchAction MOVE = new TouchAction("MOVE", 2);
    public static final TouchAction POINTER_DOWN = new TouchAction("POINTER_DOWN", 3);
    public static final TouchAction POINTER_UP = new TouchAction("POINTER_UP", 4);
    public static final TouchAction UNKNOWN = new TouchAction("UNKNOWN", 5);

    private static final /* synthetic */ TouchAction[] $values() {
        return new TouchAction[]{DOWN, UP, MOVE, POINTER_DOWN, POINTER_UP, UNKNOWN};
    }

    static {
        TouchAction[] touchActionArr$values = $values();
        $VALUES = touchActionArr$values;
        $ENTRIES = v0.h(touchActionArr$values);
    }

    private TouchAction(String str, int i) {
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static TouchAction valueOf(String str) {
        return (TouchAction) Enum.valueOf(TouchAction.class, str);
    }

    public static TouchAction[] values() {
        return (TouchAction[]) $VALUES.clone();
    }
}
