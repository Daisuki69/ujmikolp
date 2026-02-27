package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceDataChallenge {

    @InterfaceC1497a
    @InterfaceC1498b("challengeToken")
    private final String challengeToken;

    public DeviceDataChallenge(String challengeToken) {
        j.g(challengeToken, "challengeToken");
        this.challengeToken = challengeToken;
    }

    public static /* synthetic */ DeviceDataChallenge copy$default(DeviceDataChallenge deviceDataChallenge, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceDataChallenge.challengeToken;
        }
        return deviceDataChallenge.copy(str);
    }

    public final String component1() {
        return this.challengeToken;
    }

    public final DeviceDataChallenge copy(String challengeToken) {
        j.g(challengeToken, "challengeToken");
        return new DeviceDataChallenge(challengeToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceDataChallenge) && j.b(this.challengeToken, ((DeviceDataChallenge) obj).challengeToken);
    }

    public final String getChallengeToken() {
        return this.challengeToken;
    }

    public int hashCode() {
        return this.challengeToken.hashCode();
    }

    public String toString() {
        return s.j("DeviceDataChallenge(challengeToken=", this.challengeToken, ")");
    }
}
