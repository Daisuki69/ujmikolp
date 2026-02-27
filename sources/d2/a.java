package D2;

import d4.AbstractC1331a;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f967b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f968d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f969g;
    public byte h;

    public final b a() {
        if (this.h == 3 && this.f967b != 0) {
            return new b(this.f966a, this.f967b, this.c, this.f968d, this.e, this.f, this.f969g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f967b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
