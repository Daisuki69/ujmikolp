package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.C1398w;
import dg.C1399x;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class File extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String contentType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String createdDate;

    @WireField(adapter = "dde.protobuf.fragments.Resolution#ADAPTER", schemaIndex = 3, tag = 4)
    private final Resolution dimension;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String volumeName;
    public static final C1399x Companion = new C1399x();
    public static final ProtoAdapter<File> ADAPTER = new C1398w(FieldEncoding.LENGTH_DELIMITED, z.a(File.class), "type.googleapis.com/dde.protobuf.fragments.File", Syntax.PROTO_3, null, "dde-protobuf/fragments/File.proto");

    public File() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, Resolution resolution, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = file.name;
        }
        if ((i & 2) != 0) {
            str2 = file.contentType;
        }
        if ((i & 4) != 0) {
            str3 = file.size;
        }
        if ((i & 8) != 0) {
            resolution = file.dimension;
        }
        if ((i & 16) != 0) {
            str4 = file.createdDate;
        }
        if ((i & 32) != 0) {
            str5 = file.path;
        }
        if ((i & 64) != 0) {
            str6 = file.volumeName;
        }
        if ((i & 128) != 0) {
            byteString = file.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        return file.copy(str, str2, str3, resolution, str8, str9, str7, byteString2);
    }

    public final File copy(String str, String str2, String str3, Resolution resolution, String str4, String str5, String str6, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new File(str, str2, str3, resolution, str4, str5, str6, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof File)) {
            return false;
        }
        File file = (File) obj;
        return j.b(unknownFields(), file.unknownFields()) && j.b(this.name, file.name) && j.b(this.contentType, file.contentType) && j.b(this.size, file.size) && j.b(this.dimension, file.dimension) && j.b(this.createdDate, file.createdDate) && j.b(this.path, file.path) && j.b(this.volumeName, file.volumeName);
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final Resolution getDimension() {
        return this.dimension;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getVolumeName() {
        return this.volumeName;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.contentType;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.size;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Resolution resolution = this.dimension;
        int iHashCode5 = (iHashCode4 + (resolution != null ? resolution.hashCode() : 0)) * 37;
        String str4 = this.createdDate;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.path;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.volumeName;
        int iHashCode8 = iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m237newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.name != null) {
            AbstractC1414e.p(this.name, new StringBuilder("name="), arrayList);
        }
        if (this.contentType != null) {
            AbstractC1414e.p(this.contentType, new StringBuilder("contentType="), arrayList);
        }
        if (this.size != null) {
            AbstractC1414e.p(this.size, new StringBuilder("size="), arrayList);
        }
        if (this.dimension != null) {
            arrayList.add("dimension=" + this.dimension);
        }
        if (this.createdDate != null) {
            AbstractC1414e.p(this.createdDate, new StringBuilder("createdDate="), arrayList);
        }
        if (this.path != null) {
            AbstractC1414e.p(this.path, new StringBuilder("path="), arrayList);
        }
        if (this.volumeName != null) {
            AbstractC1414e.p(this.volumeName, new StringBuilder("volumeName="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "File{", "}", null, 56);
    }

    public /* synthetic */ File(String str, String str2, String str3, Resolution resolution, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : resolution, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m237newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public File(String str, String str2, String str3, Resolution resolution, String str4, String str5, String str6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.name = str;
        this.contentType = str2;
        this.size = str3;
        this.dimension = resolution;
        this.createdDate = str4;
        this.path = str5;
        this.volumeName = str6;
    }
}
