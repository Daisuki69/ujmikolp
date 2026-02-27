package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoReader32Kt {
    /* JADX INFO: renamed from: -forEachTag, reason: not valid java name */
    public static final ByteString m185forEachTag(ProtoReader32 protoReader32, Function1<? super Integer, ? extends Object> tagHandler) throws IOException {
        j.g(protoReader32, "<this>");
        j.g(tagHandler, "tagHandler");
        int iBeginMessage = protoReader32.beginMessage();
        while (true) {
            int iNextTag = protoReader32.nextTag();
            if (iNextTag == -1) {
                return protoReader32.endMessageAndGetUnknownFields(iBeginMessage);
            }
            tagHandler.invoke(Integer.valueOf(iNextTag));
        }
    }

    public static final ProtoReader32 ProtoReader32(ByteString source, int i, int i4) {
        j.g(source, "source");
        return new ByteArrayProtoReader32(source.toByteArray(), i, i4);
    }

    public static /* synthetic */ ProtoReader32 ProtoReader32$default(ByteString byteString, int i, int i4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = byteString.size();
        }
        return ProtoReader32(byteString, i, i4);
    }

    public static /* synthetic */ ProtoReader32 ProtoReader32$default(byte[] bArr, int i, int i4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = bArr.length;
        }
        return ProtoReader32(bArr, i, i4);
    }

    public static final ProtoReader32 ProtoReader32(byte[] source, int i, int i4) {
        j.g(source, "source");
        return new ByteArrayProtoReader32(source, i, i4);
    }
}
