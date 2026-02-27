package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityNavArgsLazyKt {

    /* JADX INFO: renamed from: androidx.navigation.ActivityNavArgsLazyKt$navArgs$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Bundle> {
        final /* synthetic */ Activity $this_navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity) {
            super(0);
            this.$this_navArgs = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            Bundle extras;
            Intent intent = this.$this_navArgs.getIntent();
            if (intent != null) {
                Activity activity = this.$this_navArgs;
                extras = intent.getExtras();
                if (extras == null) {
                    throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
                }
            } else {
                extras = null;
            }
            if (extras != null) {
                return extras;
            }
            throw new IllegalStateException("Activity " + this.$this_navArgs + " has a null Intent");
        }
    }

    @MainThread
    public static final <Args extends NavArgs> NavArgsLazy<Args> navArgs(Activity activity) {
        j.g(activity, "<this>");
        j.m();
        throw null;
    }
}
