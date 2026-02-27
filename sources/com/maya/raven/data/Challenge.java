package com.maya.raven.data;

import androidx.camera.core.impl.a;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class Challenge {

    @InterfaceC1497a
    @InterfaceC1498b("challengeToken")
    private final String challengeToken;

    public Challenge(String challengeToken) {
        j.g(challengeToken, "challengeToken");
        this.challengeToken = challengeToken;
    }

    public static /* synthetic */ Challenge copy$default(Challenge challenge, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challenge.challengeToken;
        }
        return challenge.copy(str);
    }

    public final String component1() {
        return this.challengeToken;
    }

    public final Challenge copy(String challengeToken) {
        j.g(challengeToken, "challengeToken");
        return new Challenge(challengeToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Challenge) && j.b(this.challengeToken, ((Challenge) obj).challengeToken);
    }

    public final String getChallengeToken() {
        return this.challengeToken;
    }

    public int hashCode() {
        return this.challengeToken.hashCode();
    }

    public String toString() {
        return a.n(new StringBuilder("Challenge(challengeToken="), this.challengeToken, ')');
    }
}
