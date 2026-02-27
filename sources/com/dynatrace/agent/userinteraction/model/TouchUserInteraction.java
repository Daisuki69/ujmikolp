package com.dynatrace.agent.userinteraction.model;

import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class TouchUserInteraction {
    private final UiElement ancestor;
    private final UiElement element;
    private final List<TouchEvent> positions;

    public TouchUserInteraction(List<TouchEvent> positions, UiElement element, UiElement uiElement) {
        j.g(positions, "positions");
        j.g(element, "element");
        this.positions = positions;
        this.element = element;
        this.ancestor = uiElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TouchUserInteraction copy$default(TouchUserInteraction touchUserInteraction, List list, UiElement uiElement, UiElement uiElement2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = touchUserInteraction.positions;
        }
        if ((i & 2) != 0) {
            uiElement = touchUserInteraction.element;
        }
        if ((i & 4) != 0) {
            uiElement2 = touchUserInteraction.ancestor;
        }
        return touchUserInteraction.copy(list, uiElement, uiElement2);
    }

    public final List<TouchEvent> component1() {
        return this.positions;
    }

    public final UiElement component2() {
        return this.element;
    }

    public final UiElement component3() {
        return this.ancestor;
    }

    public final TouchUserInteraction copy(List<TouchEvent> positions, UiElement element, UiElement uiElement) {
        j.g(positions, "positions");
        j.g(element, "element");
        return new TouchUserInteraction(positions, element, uiElement);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchUserInteraction)) {
            return false;
        }
        TouchUserInteraction touchUserInteraction = (TouchUserInteraction) obj;
        return j.b(this.positions, touchUserInteraction.positions) && j.b(this.element, touchUserInteraction.element) && j.b(this.ancestor, touchUserInteraction.ancestor);
    }

    public final UiElement getAncestor() {
        return this.ancestor;
    }

    public final UiElement getElement() {
        return this.element;
    }

    public final List<TouchEvent> getPositions() {
        return this.positions;
    }

    public int hashCode() {
        int iHashCode = (this.element.hashCode() + (this.positions.hashCode() * 31)) * 31;
        UiElement uiElement = this.ancestor;
        return iHashCode + (uiElement == null ? 0 : uiElement.hashCode());
    }

    public String toString() {
        return "TouchUserInteraction(positions=" + this.positions + ", element=" + this.element + ", ancestor=" + this.ancestor + ')';
    }
}
