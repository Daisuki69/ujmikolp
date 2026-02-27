package androidx.navigation.fragment;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgs;
import androidx.navigation.NavArgsLazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentNavArgsLazyKt {

    /* JADX INFO: renamed from: androidx.navigation.fragment.FragmentNavArgsLazyKt$navArgs$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Bundle> {
        final /* synthetic */ Fragment $this_navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$this_navArgs = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            Bundle arguments = this.$this_navArgs.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.$this_navArgs + " has null arguments");
        }
    }

    @MainThread
    public static final <Args extends NavArgs> NavArgsLazy<Args> navArgs(Fragment fragment) {
        j.g(fragment, "<this>");
        j.m();
        throw null;
    }
}
