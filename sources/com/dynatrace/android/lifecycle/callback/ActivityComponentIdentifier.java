package com.dynatrace.android.lifecycle.callback;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityComponentIdentifier implements ComponentIdentifier<Activity> {
    @Override // com.dynatrace.android.lifecycle.callback.ComponentIdentifier
    public ComponentIdentity obtainIdentity(Activity activity) {
        return new ComponentIdentity(activity.getComponentName().getClassName(), System.identityHashCode(activity));
    }
}
