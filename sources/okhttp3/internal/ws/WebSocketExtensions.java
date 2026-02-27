package okhttp3.internal.ws;

import androidx.camera.core.impl.a;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okhttp3.Headers;
import okhttp3.internal.Util;
import zj.C2576A;
import zj.y;
import zj.z;

/* JADX INFO: loaded from: classes5.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WebSocketExtensions parse(Headers responseHeaders) throws IOException {
            j.g(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z4 = false;
            Integer numF = null;
            boolean z5 = false;
            Integer numF2 = null;
            boolean z8 = false;
            boolean z9 = false;
            for (int i = 0; i < size; i++) {
                if (z.o(responseHeaders.name(i), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String strValue = responseHeaders.value(i);
                    int i4 = 0;
                    while (i4 < strValue.length()) {
                        int i6 = i4;
                        int iDelimiterOffset$default = Util.delimiterOffset$default(strValue, ',', i6, 0, 4, (Object) null);
                        int iDelimiterOffset = Util.delimiterOffset(strValue, ';', i6, iDelimiterOffset$default);
                        String strTrimSubstring = Util.trimSubstring(strValue, i6, iDelimiterOffset);
                        int i10 = iDelimiterOffset + 1;
                        if (z.o(strTrimSubstring, "permessage-deflate", true)) {
                            if (!z4) {
                                z9 = true;
                                while (i10 < iDelimiterOffset$default) {
                                    int iDelimiterOffset2 = Util.delimiterOffset(strValue, ';', i10, iDelimiterOffset$default);
                                    int iDelimiterOffset3 = Util.delimiterOffset(strValue, '=', i10, iDelimiterOffset2);
                                    String strTrimSubstring2 = Util.trimSubstring(strValue, i10, iDelimiterOffset3);
                                    String strO = iDelimiterOffset3 < iDelimiterOffset2 ? C2576A.O(Util.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2)) : null;
                                    int i11 = iDelimiterOffset2 + 1;
                                    if (z.o(strTrimSubstring2, "client_max_window_bits", true)) {
                                        if (numF != null) {
                                            z9 = true;
                                        }
                                        numF = strO != null ? y.f(strO) : null;
                                        i10 = numF == null ? i11 : i11;
                                    } else if (z.o(strTrimSubstring2, "client_no_context_takeover", true)) {
                                        if (z5) {
                                            z9 = true;
                                        }
                                        if (strO != null) {
                                            z9 = true;
                                        }
                                        i10 = i11;
                                        z5 = true;
                                    } else if (z.o(strTrimSubstring2, "server_max_window_bits", true)) {
                                        if (numF2 != null) {
                                            z9 = true;
                                        }
                                        numF2 = strO != null ? y.f(strO) : null;
                                        if (numF2 == null) {
                                        }
                                    } else if (z.o(strTrimSubstring2, "server_no_context_takeover", true)) {
                                        if (z8) {
                                            z9 = true;
                                        }
                                        if (strO != null) {
                                            z9 = true;
                                        }
                                        i10 = i11;
                                        z8 = true;
                                    }
                                }
                                i4 = i10;
                                z4 = true;
                            }
                            z9 = true;
                        } else {
                            i4 = i10;
                            z9 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z4, numF, z5, numF2, z8, z9);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z4, Integer num, boolean z5, Integer num2, boolean z8, boolean z9, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = webSocketExtensions.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i & 4) != 0) {
            z5 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i & 16) != 0) {
            z8 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i & 32) != 0) {
            z9 = webSocketExtensions.unknownValues;
        }
        boolean z10 = z8;
        boolean z11 = z9;
        return webSocketExtensions.copy(z4, num, z5, num2, z10, z11);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z4, Integer num, boolean z5, Integer num2, boolean z8, boolean z9) {
        return new WebSocketExtensions(z4, num, z5, num2, z8, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && j.b(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && j.b(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z4 = this.perMessageDeflate;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z5 = this.clientNoContextTakeover;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int i4 = (iHashCode + r22) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z8 = this.serverNoContextTakeover;
        ?? r23 = z8;
        if (z8) {
            r23 = 1;
        }
        int i6 = (iHashCode2 + r23) * 31;
        boolean z9 = this.unknownValues;
        return i6 + (z9 ? 1 : z9);
    }

    public final boolean noContextTakeover(boolean z4) {
        return z4 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.perMessageDeflate);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.clientMaxWindowBits);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.clientNoContextTakeover);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.serverMaxWindowBits);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.serverNoContextTakeover);
        sb2.append(", unknownValues=");
        return a.q(sb2, this.unknownValues, ')');
    }

    public WebSocketExtensions(boolean z4, Integer num, boolean z5, Integer num2, boolean z8, boolean z9) {
        this.perMessageDeflate = z4;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z5;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z8;
        this.unknownValues = z9;
    }

    public /* synthetic */ WebSocketExtensions(boolean z4, Integer num, boolean z5, Integer num2, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z4, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z5, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? false : z8, (i & 32) != 0 ? false : z9);
    }
}
