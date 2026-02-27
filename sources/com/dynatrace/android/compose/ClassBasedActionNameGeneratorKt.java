package com.dynatrace.android.compose;

import We.s;
import androidx.compose.ui.semantics.Role;
import com.dynatrace.android.compose.pager.PagerInfo;
import com.dynatrace.android.compose.pullrefresh.PullRefreshInfo;
import com.dynatrace.android.compose.slider.RangeSliderInfo;
import com.dynatrace.android.compose.slider.SliderInfo;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassBasedActionNameGeneratorKt {
    private static final String COMPONENT_NAME = "component";

    private static final String classNameWithoutPackage(String str) {
        return C2576A.W('.', str, (2 & 2) != 0 ? str : null);
    }

    public static final String generateActionName(ClickableInfo clickableInfo, String str) {
        String str2;
        j.g(clickableInfo, "<this>");
        Role roleM172getRoleRLKlGQI = clickableInfo.m172getRoleRLKlGQI();
        if (roleM172getRoleRLKlGQI == null || (str2 = Role.toString-impl(roleM172getRoleRLKlGQI.unbox-impl())) == null) {
            str2 = COMPONENT_NAME;
        }
        if (str != null) {
            return "Touch on ".concat(str);
        }
        StringBuilder sbW = s.w("Touch on ", str2, " with function ");
        sbW.append(classNameWithoutPackage(clickableInfo.getFunction().getClass()));
        return sbW.toString();
    }

    private static final String classNameWithoutPackage(Class<?> cls) {
        return classNameWithoutPackage(cls.getName());
    }

    public static final String generateActionName(ToggleableInfo toggleableInfo, String str) {
        String str2;
        j.g(toggleableInfo, "<this>");
        Role roleM173getRoleRLKlGQI = toggleableInfo.m173getRoleRLKlGQI();
        if (roleM173getRoleRLKlGQI == null || (str2 = Role.toString-impl(roleM173getRoleRLKlGQI.unbox-impl())) == null) {
            str2 = COMPONENT_NAME;
        }
        if (str != null) {
            return "Touch on ".concat(str);
        }
        StringBuilder sbW = s.w("Touch on ", str2, " with function ");
        sbW.append(classNameWithoutPackage(toggleableInfo.getSourceName()));
        return sbW.toString();
    }

    public static final String generateActionName(SwipeableInfo swipeableInfo, String str, boolean z4) {
        j.g(swipeableInfo, "<this>");
        if (z4) {
            return "Swipe component with " + classNameWithoutPackage(swipeableInfo.getSourceName());
        }
        if (str != null) {
            StringBuilder sbW = s.w("Swipe ", str, " to ");
            sbW.append(classNameWithoutPackage(swipeableInfo.getSourceName()));
            sbW.append(' ');
            sbW.append(swipeableInfo.getToState());
            return sbW.toString();
        }
        return "Swipe to " + classNameWithoutPackage(swipeableInfo.getSourceName()) + ' ' + swipeableInfo.getToState();
    }

    public static final String generateActionName(PullRefreshInfo pullRefreshInfo, String str) {
        j.g(pullRefreshInfo, "<this>");
        if (str != null) {
            return "Swipe to refresh ".concat(str);
        }
        return "Swipe to refresh component with function " + classNameWithoutPackage(pullRefreshInfo.getOnRefresh().getClass());
    }

    public static final String generateActionName(SliderInfo sliderInfo, String str, boolean z4) {
        j.g(sliderInfo, "<this>");
        if (str != null && !z4) {
            return "Slide to select ".concat(str);
        }
        return "Slide component with function " + classNameWithoutPackage(sliderInfo.getSource().getClass());
    }

    public static final String generateActionName(RangeSliderInfo rangeSliderInfo, String str, boolean z4) {
        j.g(rangeSliderInfo, "<this>");
        if (str != null && !z4) {
            return "Slide to select ".concat(str);
        }
        return "Slide component with function " + classNameWithoutPackage(rangeSliderInfo.getSource().getClass());
    }

    public static final String generateActionName(PagerInfo pagerInfo, String str, boolean z4) {
        j.g(pagerInfo, "<this>");
        if (str != null && !z4) {
            StringBuilder sbW = s.w("Swipe ", str, " to page index ");
            sbW.append(pagerInfo.getCurrentPage());
            return sbW.toString();
        }
        return "Swipe to page index " + pagerInfo.getCurrentPage();
    }
}
