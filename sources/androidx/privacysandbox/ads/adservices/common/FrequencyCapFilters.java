package androidx.privacysandbox.ads.adservices.common;

import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.media3.common.PlaybackException;
import androidx.privacysandbox.ads.adservices.adselection.b;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import cj.C1112C;
import defpackage.AbstractC1414e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalFeatures.Ext8OptIn
public final class FrequencyCapFilters {
    public static final int AD_EVENT_TYPE_CLICK = 3;
    public static final int AD_EVENT_TYPE_IMPRESSION = 1;
    public static final int AD_EVENT_TYPE_VIEW = 2;
    public static final int AD_EVENT_TYPE_WIN = 0;
    public static final Companion Companion = new Companion(null);
    private final List<KeyedFrequencyCap> keyedFrequencyCapsForClickEvents;
    private final List<KeyedFrequencyCap> keyedFrequencyCapsForImpressionEvents;
    private final List<KeyedFrequencyCap> keyedFrequencyCapsForViewEvents;
    private final List<KeyedFrequencyCap> keyedFrequencyCapsForWinEvents;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface AdEventType {
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FrequencyCapFilters() {
        this(null, null, null, null, 15, null);
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 8), @RequiresExtension(extension = 31, version = 9)})
    private final List<android.adservices.common.KeyedFrequencyCap> convertToAdServices(List<KeyedFrequencyCap> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<KeyedFrequencyCap> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 8), @RequiresExtension(extension = 31, version = 9)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final android.adservices.common.FrequencyCapFilters convertToAdServices$ads_adservices_release() {
        android.adservices.common.FrequencyCapFilters frequencyCapFiltersBuild = b.l().setKeyedFrequencyCapsForWinEvents(convertToAdServices(this.keyedFrequencyCapsForWinEvents)).setKeyedFrequencyCapsForImpressionEvents(convertToAdServices(this.keyedFrequencyCapsForImpressionEvents)).setKeyedFrequencyCapsForViewEvents(convertToAdServices(this.keyedFrequencyCapsForViewEvents)).setKeyedFrequencyCapsForClickEvents(convertToAdServices(this.keyedFrequencyCapsForClickEvents)).build();
        j.f(frequencyCapFiltersBuild, "Builder()\n            .s…   )\n            .build()");
        return frequencyCapFiltersBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyCapFilters)) {
            return false;
        }
        FrequencyCapFilters frequencyCapFilters = (FrequencyCapFilters) obj;
        return j.b(this.keyedFrequencyCapsForWinEvents, frequencyCapFilters.keyedFrequencyCapsForWinEvents) && j.b(this.keyedFrequencyCapsForImpressionEvents, frequencyCapFilters.keyedFrequencyCapsForImpressionEvents) && j.b(this.keyedFrequencyCapsForViewEvents, frequencyCapFilters.keyedFrequencyCapsForViewEvents) && j.b(this.keyedFrequencyCapsForClickEvents, frequencyCapFilters.keyedFrequencyCapsForClickEvents);
    }

    public final List<KeyedFrequencyCap> getKeyedFrequencyCapsForClickEvents() {
        return this.keyedFrequencyCapsForClickEvents;
    }

    public final List<KeyedFrequencyCap> getKeyedFrequencyCapsForImpressionEvents() {
        return this.keyedFrequencyCapsForImpressionEvents;
    }

    public final List<KeyedFrequencyCap> getKeyedFrequencyCapsForViewEvents() {
        return this.keyedFrequencyCapsForViewEvents;
    }

    public final List<KeyedFrequencyCap> getKeyedFrequencyCapsForWinEvents() {
        return this.keyedFrequencyCapsForWinEvents;
    }

    public int hashCode() {
        return this.keyedFrequencyCapsForClickEvents.hashCode() + AbstractC1414e.d(this.keyedFrequencyCapsForViewEvents, AbstractC1414e.d(this.keyedFrequencyCapsForImpressionEvents, this.keyedFrequencyCapsForWinEvents.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "FrequencyCapFilters: keyedFrequencyCapsForWinEvents=" + this.keyedFrequencyCapsForWinEvents + ", keyedFrequencyCapsForImpressionEvents=" + this.keyedFrequencyCapsForImpressionEvents + ", keyedFrequencyCapsForViewEvents=" + this.keyedFrequencyCapsForViewEvents + ", keyedFrequencyCapsForClickEvents=" + this.keyedFrequencyCapsForClickEvents;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrequencyCapFilters(List<KeyedFrequencyCap> keyedFrequencyCapsForWinEvents) {
        this(keyedFrequencyCapsForWinEvents, null, null, null, 14, null);
        j.g(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrequencyCapFilters(List<KeyedFrequencyCap> keyedFrequencyCapsForWinEvents, List<KeyedFrequencyCap> keyedFrequencyCapsForImpressionEvents) {
        this(keyedFrequencyCapsForWinEvents, keyedFrequencyCapsForImpressionEvents, null, null, 12, null);
        j.g(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        j.g(keyedFrequencyCapsForImpressionEvents, "keyedFrequencyCapsForImpressionEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrequencyCapFilters(List<KeyedFrequencyCap> keyedFrequencyCapsForWinEvents, List<KeyedFrequencyCap> keyedFrequencyCapsForImpressionEvents, List<KeyedFrequencyCap> keyedFrequencyCapsForViewEvents) {
        this(keyedFrequencyCapsForWinEvents, keyedFrequencyCapsForImpressionEvents, keyedFrequencyCapsForViewEvents, null, 8, null);
        j.g(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        j.g(keyedFrequencyCapsForImpressionEvents, "keyedFrequencyCapsForImpressionEvents");
        j.g(keyedFrequencyCapsForViewEvents, "keyedFrequencyCapsForViewEvents");
    }

    public FrequencyCapFilters(List<KeyedFrequencyCap> keyedFrequencyCapsForWinEvents, List<KeyedFrequencyCap> keyedFrequencyCapsForImpressionEvents, List<KeyedFrequencyCap> keyedFrequencyCapsForViewEvents, List<KeyedFrequencyCap> keyedFrequencyCapsForClickEvents) {
        j.g(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        j.g(keyedFrequencyCapsForImpressionEvents, "keyedFrequencyCapsForImpressionEvents");
        j.g(keyedFrequencyCapsForViewEvents, "keyedFrequencyCapsForViewEvents");
        j.g(keyedFrequencyCapsForClickEvents, "keyedFrequencyCapsForClickEvents");
        this.keyedFrequencyCapsForWinEvents = keyedFrequencyCapsForWinEvents;
        this.keyedFrequencyCapsForImpressionEvents = keyedFrequencyCapsForImpressionEvents;
        this.keyedFrequencyCapsForViewEvents = keyedFrequencyCapsForViewEvents;
        this.keyedFrequencyCapsForClickEvents = keyedFrequencyCapsForClickEvents;
    }

    public FrequencyCapFilters(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1112C.f9377a : list, (i & 2) != 0 ? C1112C.f9377a : list2, (i & 4) != 0 ? C1112C.f9377a : list3, (i & 8) != 0 ? C1112C.f9377a : list4);
    }
}
