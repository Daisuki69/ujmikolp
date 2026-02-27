package com.dynatrace.agent.userinteraction.model;

import androidx.camera.core.impl.a;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import cj.C1110A;
import cj.r;
import com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.k;
import zj.n;
import zj.o;

/* JADX INFO: loaded from: classes2.dex */
public final class TouchUserInteractionComposeGenerator {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String DEFAULT_CLASS_NAME = "Composable";

    @Deprecated
    public static final String DEFAULT_ID = "Compose.undefined_id";

    @Deprecated
    public static final String DEFAULT_NAME = "Compose.undefined_name";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final String calculateLayoutPosition(LayoutInfo layoutInfo, List<? extends List<String>> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Integer.parseInt((String) C1110A.A((List) next)) == layoutInfo.getSemanticsId()) {
                break;
            }
        }
        List list2 = (List) next;
        String str = list2 != null ? (String) C1110A.C(1, list2) : null;
        return str == null ? "" : str;
    }

    private final String generatePath(LayoutInfo layoutInfo, List<? extends List<String>> list) {
        if (layoutInfo == null || layoutInfo.getParentInfo() == null) {
            return "";
        }
        String strGeneratePath = generatePath(layoutInfo.getParentInfo(), list);
        String customId = UserInteractionUtilKt.getCustomId(layoutInfo);
        if (customId == null && (customId = UserInteractionUtilKt.getRole(layoutInfo)) == null && (customId = getTypeFromMeasurePolicy(layoutInfo)) == null) {
            customId = DEFAULT_ID;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strGeneratePath);
        sb2.append('/');
        sb2.append(customId);
        sb2.append('[');
        return a.n(sb2, calculateLayoutPosition(layoutInfo, list), ']');
    }

    private final String getClass(LayoutInfo layoutInfo) {
        String strConcat;
        String role = UserInteractionUtilKt.getRole(layoutInfo);
        if (role != null && (strConcat = "Compose.".concat(role)) != null) {
            return strConcat;
        }
        String typeFromMeasurePolicy = getTypeFromMeasurePolicy(layoutInfo);
        return typeFromMeasurePolicy != null ? "Compose.".concat(typeFromMeasurePolicy) : DEFAULT_CLASS_NAME;
    }

    private final String getElementName(LayoutInfo layoutInfo) {
        String customName = UserInteractionUtilKt.getCustomName(layoutInfo);
        if (customName != null) {
            return customName;
        }
        String text = UserInteractionUtilKt.getText(layoutInfo);
        return text == null ? DEFAULT_NAME : text;
    }

    private final String getId(LayoutInfo layoutInfo, List<? extends List<String>> list) {
        String customId = UserInteractionUtilKt.getCustomId(layoutInfo);
        return customId == null ? generatePath(layoutInfo, list) : customId;
    }

    private final LayoutInfo getTopLayoutAtPoint(List<? extends LayoutInfo> list, TouchEvent touchEvent) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Rect area = UserInteractionUtilKt.getArea((LayoutInfo) obj2);
            if (touchEvent.getX() >= area.getLeft() && touchEvent.getX() <= area.getRight() && touchEvent.getY() >= area.getTop() && touchEvent.getY() <= area.getBottom()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Rect area2 = UserInteractionUtilKt.getArea((LayoutInfo) next);
                float bottom = (area2.getBottom() - area2.getTop()) * (area2.getRight() - area2.getLeft());
                do {
                    Object next2 = it.next();
                    Rect area3 = UserInteractionUtilKt.getArea((LayoutInfo) next2);
                    float bottom2 = (area3.getBottom() - area3.getTop()) * (area3.getRight() - area3.getLeft());
                    if (Float.compare(bottom, bottom2) > 0) {
                        next = next2;
                        bottom = bottom2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (LayoutInfo) obj;
    }

    private final String getTypeFromMeasurePolicy(LayoutInfo layoutInfo) {
        n nVarB = new o("\\s(\\w*MeasurePolicy)\\b").b(layoutInfo.toString());
        String str = nVarB != null ? (String) ((k) nVarB.a()).get(1) : null;
        if (str != null) {
            return C2576A.N(str, "MeasurePolicy");
        }
        return null;
    }

    public final TouchUserInteraction generate$com_dynatrace_agent_release(List<TouchEvent> touchList, ComposeHitEvent composeHitEvent) {
        LayoutInfo topLayoutAtPoint;
        j.g(touchList, "touchList");
        TouchEvent touchEvent = (TouchEvent) C1110A.H(touchList);
        if (touchEvent == null || composeHitEvent == null || (topLayoutAtPoint = getTopLayoutAtPoint(composeHitEvent.getOverlappedAreas(), touchEvent)) == null) {
            return null;
        }
        UiElement uiElement = new UiElement(getElementName(topLayoutAtPoint), getClass(topLayoutAtPoint), getId(topLayoutAtPoint, composeHitEvent.getSequentialList()));
        LayoutInfo hitArea = composeHitEvent.getHitArea();
        return (TouchEventKt.isInArea(touchEvent, UserInteractionUtilKt.getArea(hitArea)) && UserInteractionUtilKt.isClickable(hitArea)) ? new TouchUserInteraction(r.c(touchEvent), uiElement, new UiElement(getElementName(hitArea), getClass(hitArea), getId(hitArea, composeHitEvent.getSequentialList()))) : new TouchUserInteraction(r.c(touchEvent), uiElement, null);
    }
}
