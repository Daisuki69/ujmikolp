package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9862a;

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.f9862a = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.f9862a = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str, int i4) {
        super(str);
        this.f9862a = i;
    }

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.f9862a = -1;
    }
}
