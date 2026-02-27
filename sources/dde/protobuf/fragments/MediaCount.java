package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.C1375I;
import dg.C1376J;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaCount extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 0, tag = 1)
    private final Integer image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 1, tag = 2)
    private final Integer video;
    public static final C1376J Companion = new C1376J();
    public static final ProtoAdapter<MediaCount> ADAPTER = new C1375I(FieldEncoding.LENGTH_DELIMITED, z.a(MediaCount.class), "type.googleapis.com/dde.protobuf.fragments.MediaCount", Syntax.PROTO_3, null, "dde-protobuf/fragments/MediaCount.proto");

    public MediaCount() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MediaCount copy$default(MediaCount mediaCount, Integer num, Integer num2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            num = mediaCount.image;
        }
        if ((i & 2) != 0) {
            num2 = mediaCount.video;
        }
        if ((i & 4) != 0) {
            byteString = mediaCount.unknownFields();
        }
        return mediaCount.copy(num, num2, byteString);
    }

    public final MediaCount copy(Integer num, Integer num2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new MediaCount(num, num2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaCount)) {
            return false;
        }
        MediaCount mediaCount = (MediaCount) obj;
        return j.b(unknownFields(), mediaCount.unknownFields()) && j.b(this.image, mediaCount.image) && j.b(this.video, mediaCount.video);
    }

    public final Integer getImage() {
        return this.image;
    }

    public final Integer getVideo() {
        return this.video;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.image;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.video;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m243newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.image != null) {
            AbstractC1414e.r(new StringBuilder("image="), this.image, arrayList);
        }
        if (this.video != null) {
            AbstractC1414e.r(new StringBuilder("video="), this.video, arrayList);
        }
        return C1110A.F(arrayList, ", ", "MediaCount{", "}", null, 56);
    }

    public /* synthetic */ MediaCount(Integer num, Integer num2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m243newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCount(Integer num, Integer num2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.image = num;
        this.video = num2;
    }
}
