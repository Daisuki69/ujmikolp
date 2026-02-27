package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.d0;
import dg.e0;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Volume extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String availableSize;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    private final Boolean isRemovable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String totalSize;
    public static final e0 Companion = new e0();
    public static final ProtoAdapter<Volume> ADAPTER = new d0(FieldEncoding.LENGTH_DELIMITED, z.a(Volume.class), "type.googleapis.com/dde.protobuf.fragments.Volume", Syntax.PROTO_3, null, "dde-protobuf/fragments/Volume.proto");

    public Volume() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Volume copy$default(Volume volume, String str, String str2, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = volume.totalSize;
        }
        if ((i & 2) != 0) {
            str2 = volume.availableSize;
        }
        if ((i & 4) != 0) {
            bool = volume.isRemovable;
        }
        if ((i & 8) != 0) {
            byteString = volume.unknownFields();
        }
        return volume.copy(str, str2, bool, byteString);
    }

    public final Volume copy(String str, String str2, Boolean bool, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Volume(str, str2, bool, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Volume)) {
            return false;
        }
        Volume volume = (Volume) obj;
        return j.b(unknownFields(), volume.unknownFields()) && j.b(this.totalSize, volume.totalSize) && j.b(this.availableSize, volume.availableSize) && j.b(this.isRemovable, volume.isRemovable);
    }

    public final String getAvailableSize() {
        return this.availableSize;
    }

    public final String getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.totalSize;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.availableSize;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.isRemovable;
        int iHashCode4 = iHashCode3 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    public final Boolean isRemovable() {
        return this.isRemovable;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m253newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.totalSize != null) {
            AbstractC1414e.p(this.totalSize, new StringBuilder("totalSize="), arrayList);
        }
        if (this.availableSize != null) {
            AbstractC1414e.p(this.availableSize, new StringBuilder("availableSize="), arrayList);
        }
        if (this.isRemovable != null) {
            AbstractC1414e.q(new StringBuilder("isRemovable="), this.isRemovable, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Volume{", "}", null, 56);
    }

    public /* synthetic */ Volume(String str, String str2, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m253newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Volume(String str, String str2, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.totalSize = str;
        this.availableSize = str2;
        this.isRemovable = bool;
    }
}
