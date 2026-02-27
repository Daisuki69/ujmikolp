package com.dynatrace.agent.userinteraction.util;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsProperties;
import cj.C1110A;
import cj.C1129o;
import cj.t;
import com.dynatrace.agent.userinteraction.model.DTBasicTextModifier;
import com.dynatrace.agent.userinteraction.model.DTUserInteractionsModifier;
import com.dynatrace.agent.userinteraction.model.TouchAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.j;
import yj.q;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionUtilKt {
    private static final Set<String> CLICKABLE_MODIFIER_NAMES = C1129o.C(new String[]{"androidx.compose.foundation.ClickableElement", "androidx.compose.foundation.CombinedClickableElement"});

    public static final View findTopView(ViewGroup viewGroup, int i, int i4) {
        View childAt;
        j.g(viewGroup, "<this>");
        if (isPointInBounds(viewGroup, i, i4)) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (-1 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = viewGroup.getChildAt(childCount);
                j.d(childAt);
                if (isPointInBounds(childAt, i, i4)) {
                    if (childAt instanceof ViewGroup) {
                        childAt = findTopView((ViewGroup) childAt, i, i4);
                    }
                }
            }
            if (childAt != null) {
                return childAt;
            }
        }
        return viewGroup;
    }

    public static final TouchAction getActionName(MotionEvent motionEvent) {
        j.g(motionEvent, "<this>");
        int action = motionEvent.getAction();
        return action != 0 ? action != 1 ? action != 2 ? action != 5 ? action != 6 ? TouchAction.UNKNOWN : TouchAction.POINTER_UP : TouchAction.POINTER_DOWN : TouchAction.MOVE : TouchAction.UP : TouchAction.DOWN;
    }

    public static final Rect getArea(LayoutInfo layoutInfo) {
        j.g(layoutInfo, "<this>");
        return !isValid(layoutInfo) ? Rect.Companion.getZero() : LayoutCoordinatesKt.boundsInWindow(layoutInfo.getCoordinates());
    }

    public static final Set<String> getCLICKABLE_MODIFIER_NAMES() {
        return CLICKABLE_MODIFIER_NAMES;
    }

    public static final String getCustomId(LayoutInfo layoutInfo) {
        Object next;
        j.g(layoutInfo, "<this>");
        List modifierInfo = layoutInfo.getModifierInfo();
        ArrayList arrayList = new ArrayList(t.l(modifierInfo, 10));
        Iterator it = modifierInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(((ModifierInfo) it.next()).getModifier());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof DTUserInteractionsModifier) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((DTUserInteractionsModifier) next).getCustomId() != null) {
                break;
            }
        }
        DTUserInteractionsModifier dTUserInteractionsModifier = (DTUserInteractionsModifier) next;
        if (dTUserInteractionsModifier != null) {
            return dTUserInteractionsModifier.getCustomId();
        }
        return null;
    }

    public static final String getCustomName(LayoutInfo layoutInfo) {
        Object next;
        j.g(layoutInfo, "<this>");
        List modifierInfo = layoutInfo.getModifierInfo();
        ArrayList arrayList = new ArrayList(t.l(modifierInfo, 10));
        Iterator it = modifierInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(((ModifierInfo) it.next()).getModifier());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof DTUserInteractionsModifier) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((DTUserInteractionsModifier) next).getCustomName() != null) {
                break;
            }
        }
        DTUserInteractionsModifier dTUserInteractionsModifier = (DTUserInteractionsModifier) next;
        if (dTUserInteractionsModifier != null) {
            return dTUserInteractionsModifier.getCustomName();
        }
        return null;
    }

    public static final String getRole(LayoutInfo layoutInfo) {
        j.g(layoutInfo, "<this>");
        String str = (String) q.k(q.n(q.h(q.h(q.n(C1110A.u(layoutInfo.getModifierInfo()), new a()), UserInteractionUtilKt$getRole$$inlined$filterIsInstance$1.INSTANCE), new b()), new c()));
        if (str != null) {
            return str;
        }
        if (getText(layoutInfo) != null) {
            return "Text";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier getRole$lambda$6(ModifierInfo it) {
        j.g(it, "it");
        return it.getModifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRole$lambda$7(SemanticsModifier it) {
        j.g(it, "it");
        return it.getSemanticsConfiguration().contains(SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRole$lambda$8(SemanticsModifier it) {
        j.g(it, "it");
        return Role.toString-impl(((Role) it.getSemanticsConfiguration().get(SemanticsProperties.INSTANCE.getRole())).unbox-impl());
    }

    public static final String getText(LayoutInfo layoutInfo) {
        Object next;
        j.g(layoutInfo, "<this>");
        if (layoutInfo.getModifierInfo().isEmpty()) {
            return null;
        }
        Iterator it = layoutInfo.getModifierInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ModifierInfo) next).getModifier() instanceof DTBasicTextModifier) {
                break;
            }
        }
        ModifierInfo modifierInfo = (ModifierInfo) next;
        if (modifierInfo == null) {
            return null;
        }
        DTBasicTextModifier modifier = modifierInfo.getModifier();
        j.e(modifier, "null cannot be cast to non-null type com.dynatrace.agent.userinteraction.model.DTBasicTextModifier");
        return modifier.getText();
    }

    public static final boolean isClickable(LayoutInfo layoutInfo) {
        j.g(layoutInfo, "<this>");
        List modifierInfo = layoutInfo.getModifierInfo();
        if (!(modifierInfo instanceof Collection) || !modifierInfo.isEmpty()) {
            Iterator it = modifierInfo.iterator();
            while (it.hasNext()) {
                String string = ((ModifierInfo) it.next()).getModifier().toString();
                Set<String> set = CLICKABLE_MODIFIER_NAMES;
                if (set == null || !set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (C2576A.z(string, (String) it2.next(), false, 2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static final boolean isPointInBounds(View view, int i, int i4) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i6 = iArr[0];
        int i10 = iArr[1];
        return i >= i6 && i <= view.getWidth() + i6 && i4 >= i10 && i4 <= view.getHeight() + i10;
    }

    private static final boolean isValid(LayoutInfo layoutInfo) {
        return layoutInfo.isAttached() && layoutInfo.isPlaced() && layoutInfo.getWidth() > 0 && layoutInfo.getHeight() > 0 && layoutInfo.getCoordinates().isAttached();
    }
}
