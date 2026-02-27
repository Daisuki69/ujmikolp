package com.dynatrace.agent.userinteraction.model;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class TouchEvent {
    private final TouchAction action;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f9585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f9586y;

    public TouchEvent(TouchAction action, float f, float f3) {
        j.g(action, "action");
        this.action = action;
        this.f9585x = f;
        this.f9586y = f3;
    }

    public static /* synthetic */ TouchEvent copy$default(TouchEvent touchEvent, TouchAction touchAction, float f, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            touchAction = touchEvent.action;
        }
        if ((i & 2) != 0) {
            f = touchEvent.f9585x;
        }
        if ((i & 4) != 0) {
            f3 = touchEvent.f9586y;
        }
        return touchEvent.copy(touchAction, f, f3);
    }

    public final TouchAction component1() {
        return this.action;
    }

    public final float component2() {
        return this.f9585x;
    }

    public final float component3() {
        return this.f9586y;
    }

    public final TouchEvent copy(TouchAction action, float f, float f3) {
        j.g(action, "action");
        return new TouchEvent(action, f, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchEvent)) {
            return false;
        }
        TouchEvent touchEvent = (TouchEvent) obj;
        return this.action == touchEvent.action && Float.compare(this.f9585x, touchEvent.f9585x) == 0 && Float.compare(this.f9586y, touchEvent.f9586y) == 0;
    }

    public final TouchAction getAction() {
        return this.action;
    }

    public final float getX() {
        return this.f9585x;
    }

    public final float getY() {
        return this.f9586y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f9586y) + ((Float.floatToIntBits(this.f9585x) + (this.action.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "TouchEvent(action=" + this.action + ", x=" + this.f9585x + ", y=" + this.f9586y + ')';
    }
}
