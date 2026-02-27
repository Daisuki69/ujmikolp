package okhttp3.internal.publicsuffix;

import We.s;
import a.AbstractC0617a;
import androidx.webkit.ProxyConfig;
import cj.C1110A;
import cj.C1112C;
import cj.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.sequences.Sequence;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import yj.C2537b;
import yj.c;
import yj.q;
import zj.C2576A;

/* JADX INFO: loaded from: classes5.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = r.c(ProxyConfig.MATCH_ALL_SCHEMES);
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i4;
            int iAnd;
            boolean z4;
            int iAnd2;
            int length = bArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i10 = (i6 + length) / 2;
                while (i10 > -1 && bArr[i10] != 10) {
                    i10--;
                }
                int i11 = i10 + 1;
                int i12 = 1;
                while (true) {
                    i4 = i11 + i12;
                    if (bArr[i4] == 10) {
                        break;
                    }
                    i12++;
                }
                int i13 = i4 - i11;
                int i14 = i;
                boolean z5 = false;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (z5) {
                        iAnd = 46;
                        z4 = false;
                    } else {
                        boolean z8 = z5;
                        iAnd = Util.and(bArr2[i14][i15], 255);
                        z4 = z8;
                    }
                    iAnd2 = iAnd - Util.and(bArr[i11 + i16], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i16++;
                    i15++;
                    if (i16 == i13) {
                        break;
                    }
                    if (bArr2[i14].length != i15) {
                        z5 = z4;
                    } else {
                        if (i14 == bArr2.length - 1) {
                            break;
                        }
                        i14++;
                        z5 = true;
                        i15 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i17 = i13 - i16;
                        int length2 = bArr2[i14].length - i15;
                        int length3 = bArr2.length;
                        for (int i18 = i14 + 1; i18 < length3; i18++) {
                            length2 += bArr2[i18].length;
                        }
                        if (length2 >= i17) {
                            if (length2 <= i17) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                j.f(UTF_8, "UTF_8");
                                return new String(bArr, i11, i13, UTF_8);
                            }
                        }
                    }
                    i6 = i4 + 1;
                }
                length = i10;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String strBinarySearch;
        String strBinarySearch2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str2 = list.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            j.f(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            j.f(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i4 = 0;
        while (true) {
            str = null;
            if (i4 >= size) {
                strBinarySearch = null;
                break;
            }
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                j.n("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch = companion.binarySearch(bArr2, bArr, i4);
            if (strBinarySearch != null) {
                break;
            }
            i4++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    j.n("publicSuffixListBytes");
                    throw null;
                }
                strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i6);
                if (strBinarySearch2 != null) {
                    break;
                }
            }
            strBinarySearch2 = null;
        } else {
            strBinarySearch2 = null;
        }
        if (strBinarySearch2 != null) {
            int i10 = size - 1;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    break;
                }
                Companion companion3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    j.n("publicSuffixExceptionListBytes");
                    throw null;
                }
                String strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i11);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
                i11++;
            }
        }
        if (str != null) {
            return C2576A.S("!".concat(str), new char[]{'.'});
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listS = strBinarySearch != null ? C2576A.S(strBinarySearch, new char[]{'.'}) : C1112C.f9377a;
        List<String> listS2 = strBinarySearch2 != null ? C2576A.S(strBinarySearch2, new char[]{'.'}) : C1112C.f9377a;
        return listS.size() > listS2.size() ? listS : listS2;
    }

    private final void readTheList() throws IOException {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
                try {
                    byte[] byteArray = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    byte[] byteArray2 = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                    Unit unit = Unit.f18162a;
                    AbstractC0617a.p(bufferedSourceBuffer, null);
                    synchronized (this) {
                        j.d(byteArray);
                        this.publicSuffixListBytes = byteArray;
                        j.d(byteArray2);
                        this.publicSuffixExceptionListBytes = byteArray2;
                    }
                } finally {
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z4 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z4 = true;
                } catch (IOException e) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e);
                    if (!z4) {
                        return;
                    }
                }
            } finally {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> listS = C2576A.S(str, new char[]{'.'});
        return j.b(C1110A.G(listS), "") ? C1110A.x(listS) : listS;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        j.g(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        j.f(unicodeDomain, "unicodeDomain");
        List<String> listSplitDomain = splitDomain(unicodeDomain);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        int i = size - size2;
        Sequence sequenceU = C1110A.u(splitDomain(domain));
        if (i < 0) {
            throw new IllegalArgumentException(s.g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i != 0) {
            sequenceU = sequenceU instanceof c ? ((c) sequenceU).a(i) : new C2537b(sequenceU, i);
        }
        return q.l(sequenceU, ".");
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        j.g(publicSuffixListBytes, "publicSuffixListBytes");
        j.g(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
