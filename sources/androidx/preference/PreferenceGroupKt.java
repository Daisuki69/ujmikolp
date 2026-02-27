package androidx.preference;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.sequences.Sequence;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferenceGroupKt {

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroupKt$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<Preference>, InterfaceC2210a {
        final /* synthetic */ PreferenceGroup $this_iterator;
        private int index;

        public AnonymousClass1(PreferenceGroup preferenceGroup) {
            this.$this_iterator = preferenceGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getPreferenceCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            preferenceGroup.removePreference(preferenceGroup.getPreference(i));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Preference next() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            Preference preference = preferenceGroup.getPreference(i);
            j.f(preference, "getPreference(index++)");
            return preference;
        }
    }

    public static final boolean contains(PreferenceGroup preferenceGroup, Preference preference) {
        j.g(preferenceGroup, "<this>");
        j.g(preference, "preference");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i = 0;
        while (i < preferenceCount) {
            int i4 = i + 1;
            if (j.b(preferenceGroup.getPreference(i), preference)) {
                return true;
            }
            i = i4;
        }
        return false;
    }

    public static final void forEach(PreferenceGroup preferenceGroup, Function1<? super Preference, Unit> action) {
        j.g(preferenceGroup, "<this>");
        j.g(action, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            action.invoke(get(preferenceGroup, i));
        }
    }

    public static final void forEachIndexed(PreferenceGroup preferenceGroup, Function2<? super Integer, ? super Preference, Unit> action) {
        j.g(preferenceGroup, "<this>");
        j.g(action, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            action.invoke(Integer.valueOf(i), get(preferenceGroup, i));
        }
    }

    public static final <T extends Preference> T get(PreferenceGroup preferenceGroup, CharSequence key) {
        j.g(preferenceGroup, "<this>");
        j.g(key, "key");
        return (T) preferenceGroup.findPreference(key);
    }

    public static final Sequence<Preference> getChildren(final PreferenceGroup preferenceGroup) {
        j.g(preferenceGroup, "<this>");
        return new Sequence<Preference>() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // kotlin.sequences.Sequence
            public Iterator<Preference> iterator() {
                return PreferenceGroupKt.iterator(preferenceGroup);
            }
        };
    }

    public static final int getSize(PreferenceGroup preferenceGroup) {
        j.g(preferenceGroup, "<this>");
        return preferenceGroup.getPreferenceCount();
    }

    public static final boolean isEmpty(PreferenceGroup preferenceGroup) {
        j.g(preferenceGroup, "<this>");
        return preferenceGroup.getPreferenceCount() == 0;
    }

    public static final boolean isNotEmpty(PreferenceGroup preferenceGroup) {
        j.g(preferenceGroup, "<this>");
        return preferenceGroup.getPreferenceCount() != 0;
    }

    public static final Iterator<Preference> iterator(PreferenceGroup preferenceGroup) {
        j.g(preferenceGroup, "<this>");
        return new AnonymousClass1(preferenceGroup);
    }

    public static final void minusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        j.g(preferenceGroup, "<this>");
        j.g(preference, "preference");
        preferenceGroup.removePreference(preference);
    }

    public static final void plusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        j.g(preferenceGroup, "<this>");
        j.g(preference, "preference");
        preferenceGroup.addPreference(preference);
    }

    public static final Preference get(PreferenceGroup preferenceGroup, int i) {
        j.g(preferenceGroup, "<this>");
        Preference preference = preferenceGroup.getPreference(i);
        j.f(preference, "getPreference(index)");
        return preference;
    }
}
