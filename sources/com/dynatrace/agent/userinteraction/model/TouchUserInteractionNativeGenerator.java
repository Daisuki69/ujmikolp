package com.dynatrace.agent.userinteraction.model;

import We.s;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import cj.C1110A;
import com.dynatrace.agent.userinteraction.util.UserInteractionMaskingValidator;
import com.dynatrace.agent.userinteraction.util.UserInteractionUtilKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class TouchUserInteractionNativeGenerator {
    private static final Companion Companion = new Companion(null);
    private static final String MASKED_LABEL = "***";
    private final UserInteractionMaskingValidator maskingValidator;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TouchUserInteractionNativeGenerator(UserInteractionMaskingValidator maskingValidator) {
        j.g(maskingValidator, "maskingValidator");
        this.maskingValidator = maskingValidator;
    }

    private final String getClassName(View view) {
        return view.getClass().getSimpleName();
    }

    private final String getHierarchyPath(View view) {
        if (view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return getClassName(view);
        }
        String viewId = getViewId(view);
        if (viewId.length() == 0) {
            Object parent = view.getParent();
            j.e(parent, "null cannot be cast to non-null type android.view.View");
            return getHierarchyPath((View) parent);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(viewId);
        sb2.append('[');
        ViewParent parent2 = view.getParent();
        j.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        sb2.append(((ViewGroup) parent2).indexOfChild(view));
        sb2.append(']');
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        Object parent3 = view.getParent();
        j.e(parent3, "null cannot be cast to non-null type android.view.View");
        sb3.append(getHierarchyPath((View) parent3));
        sb3.append('/');
        sb3.append(string);
        return sb3.toString();
    }

    private final String getUIElementId(View view) {
        String hierarchyPath = getHierarchyPath(view);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        Integer numValueOf = viewGroup != null ? Integer.valueOf(viewGroup.indexOfChild(view)) : null;
        String viewId = getViewId(view);
        if (viewId.length() == 0 || numValueOf == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(hierarchyPath);
            sb2.append('/');
            sb2.append(getClassName(view));
            sb2.append('[');
            return s.m(sb2, numValueOf != null ? numValueOf.intValue() : 0, ']');
        }
        return C2576A.a0(hierarchyPath, "/") + '/' + viewId + '[' + numValueOf + ']';
    }

    private final UiElement getUiElement(View view) {
        return new UiElement(getViewName(view), getClassName(view), getUIElementId(view));
    }

    private final String getViewId(View view) {
        try {
            String resourceName = view.getResources().getResourceName(view.getId());
            j.d(resourceName);
            return C2576A.z(resourceName, ":id/", false, 2) ? C2576A.V(resourceName, ":id/", resourceName) : resourceName;
        } catch (Resources.NotFoundException unused) {
            return view.getContentDescription() != null ? view.getContentDescription().toString() : (view.getTag() == null || this.maskingValidator.isMaskedByTag(view)) ? getClassName(view) : view.getTag().toString();
        }
    }

    private final String getViewName(View view) {
        if (this.maskingValidator.isViewMasked(view)) {
            return MASKED_LABEL;
        }
        if (!(view instanceof TextView)) {
            return getClassName(view);
        }
        CharSequence text = ((TextView) view).getText();
        String string = text != null ? text.toString() : null;
        String str = string == null || string.length() == 0 ? null : string;
        return str == null ? getClassName(view) : str;
    }

    public final TouchUserInteraction generate$com_dynatrace_agent_release(List<TouchEvent> touchList, ViewGroup rootView, View view) {
        j.g(touchList, "touchList");
        j.g(rootView, "rootView");
        TouchEvent touchEvent = (TouchEvent) C1110A.H(touchList);
        if (touchEvent == null) {
            return null;
        }
        View viewFindTopView = UserInteractionUtilKt.findTopView(rootView, (int) touchEvent.getX(), (int) touchEvent.getY());
        List<TouchEvent> list = touchList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TouchEvent) obj).getAction() == TouchAction.MOVE) {
                arrayList.add(obj);
            }
        }
        List listFilterDistantTouches$default = TouchEventKt.filterDistantTouches$default(arrayList, 0, 1, null);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            TouchEvent touchEvent2 = (TouchEvent) obj2;
            if (touchEvent2.getAction() != TouchAction.MOVE || listFilterDistantTouches$default.contains(touchEvent2)) {
                arrayList2.add(obj2);
            }
        }
        return new TouchUserInteraction(arrayList2, getUiElement(viewFindTopView), view != null ? getUiElement(view) : null);
    }
}
