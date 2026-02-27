package com.dynatrace.android.compose;

import We.s;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.api.compose.SemanticsExtensionKt;
import com.dynatrace.android.compose.SemanticsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class SemanticsManager {
    private static SemanticsConfiguration configuration;
    public static final SemanticsManager INSTANCE = new SemanticsManager();
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "SemanticsManager");
    public static final int $stable = 8;

    private SemanticsManager() {
    }

    private final String fetchNameForDescriptionProperty(SemanticsConfiguration semanticsConfiguration) {
        Object next;
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((String) next).length() > 0) {
                    break;
                }
            }
            String strFetchNameForTextProperty = (String) next;
            if (strFetchNameForTextProperty == null) {
                strFetchNameForTextProperty = INSTANCE.fetchNameForTextProperty(semanticsConfiguration);
            }
            if (strFetchNameForTextProperty != null) {
                return strFetchNameForTextProperty;
            }
        }
        return fetchNameForTextProperty(semanticsConfiguration);
    }

    private final String fetchNameForDtProperty(SemanticsConfiguration semanticsConfiguration) {
        String strFetchNameForDescriptionProperty = (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsExtensionKt.getDtActionName());
        if (strFetchNameForDescriptionProperty != null) {
            if (strFetchNameForDescriptionProperty.length() == 0) {
                strFetchNameForDescriptionProperty = INSTANCE.fetchNameForDescriptionProperty(semanticsConfiguration);
            }
            if (strFetchNameForDescriptionProperty != null) {
                return strFetchNameForDescriptionProperty;
            }
        }
        return fetchNameForDescriptionProperty(semanticsConfiguration);
    }

    private final String fetchNameForTextProperty(SemanticsConfiguration semanticsConfiguration) {
        Object next;
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AnnotatedString) next).getText().length() > 0) {
                    break;
                }
            }
            AnnotatedString annotatedString = (AnnotatedString) next;
            if (annotatedString != null) {
                return annotatedString.getText();
            }
        }
        return null;
    }

    private final String fetchSemanticsName(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.contains(SemanticsExtensionKt.getDtActionName())) {
            return fetchNameForDtProperty(semanticsConfiguration);
        }
        if (semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            return fetchNameForDescriptionProperty(semanticsConfiguration);
        }
        if (semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getText())) {
            return fetchNameForTextProperty(semanticsConfiguration);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchSemanticsNameFromModifier$lambda$5(SemanticsConfiguration semanticsConfiguration, List list, List list2, Unit unit, Modifier.Element element) {
        j.g(unit, "<unused var>");
        j.g(element, "element");
        if (element instanceof SemanticsModifier) {
            SemanticsModifier semanticsModifier = (SemanticsModifier) element;
            String str = (String) SemanticsConfigurationKt.getOrNull(semanticsModifier.getSemanticsConfiguration(), SemanticsExtensionKt.getDtActionName());
            if (str != null) {
                semanticsConfiguration.set(SemanticsExtensionKt.getDtActionName(), str);
            }
            List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsModifier.getSemanticsConfiguration(), SemanticsProperties.INSTANCE.getContentDescription());
            if (list3 != null) {
                list.addAll(list3);
            }
            List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsModifier.getSemanticsConfiguration(), SemanticsProperties.INSTANCE.getText());
            if (list4 != null) {
                list2.addAll(list4);
            }
        }
        return Unit.f18162a;
    }

    public final String fetchNameAndClear() {
        String str;
        if (Global.DEBUG) {
            if (configuration == null) {
                str = "onUA: no SemanticsConfiguration value available";
            } else {
                str = "onUA: " + configuration;
            }
            Utility.zlogD(TAG, str);
        }
        SemanticsConfiguration semanticsConfiguration = configuration;
        String strFetchSemanticsName = semanticsConfiguration != null ? INSTANCE.fetchSemanticsName(semanticsConfiguration) : null;
        configuration = null;
        return strFetchSemanticsName;
    }

    public final Object fetchRole() {
        SemanticsConfiguration semanticsConfiguration = configuration;
        if (semanticsConfiguration != null) {
            return (Role) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getRole());
        }
        return null;
    }

    public final String fetchSemanticsNameFromModifier(Modifier modifier) {
        final SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (modifier != null) {
            modifier.foldIn(Unit.f18162a, new Function2() { // from class: z0.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SemanticsManager.fetchSemanticsNameFromModifier$lambda$5(semanticsConfiguration, arrayList, arrayList2, (Unit) obj, (Modifier.Element) obj2);
                }
            });
        }
        semanticsConfiguration.set(SemanticsProperties.INSTANCE.getContentDescription(), arrayList);
        semanticsConfiguration.set(SemanticsProperties.INSTANCE.getText(), arrayList2);
        return fetchSemanticsName(semanticsConfiguration);
    }

    public final SemanticsConfiguration getConfiguration() {
        return configuration;
    }

    public final boolean isFinalReleaseActionState(PointerEvent event, PointerEventPass pass) {
        j.g(event, "event");
        j.g(pass, "pass");
        return PointerEventType.equals-impl0(event.getType-7fucELk(), PointerEventType.Companion.getRelease-7fucELk()) && pass.ordinal() == PointerEventPass.Final.ordinal();
    }

    public final boolean isReleaseActionState(PointerEvent event) {
        j.g(event, "event");
        return PointerEventType.equals-impl0(event.getType-7fucELk(), PointerEventType.Companion.getRelease-7fucELk());
    }

    public final void setConfiguration(SemanticsConfiguration semanticsConfiguration) {
        configuration = semanticsConfiguration;
    }
}
