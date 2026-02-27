package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Media extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contentType", schemaIndex = 1, tag = 2)
    private final String content_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdDate", schemaIndex = 4, tag = 5)
    private final String created_date;

    @WireField(adapter = "Dimension#ADAPTER", schemaIndex = 3, tag = 4)
    private final Dimension dimension;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fileName", schemaIndex = 0, tag = 1)
    private final String file_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "volumeName", schemaIndex = 6, tag = 7)
    private final String volume_name;
    public static final Y Companion = new Y();
    public static final ProtoAdapter<Media> ADAPTER = new X(FieldEncoding.LENGTH_DELIMITED, z.a(Media.class), "type.googleapis.com/Media", Syntax.PROTO_3, null, "dde-protobuf/models/media.proto");

    public Media() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ Media copy$default(Media media, String str, String str2, String str3, Dimension dimension, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = media.file_name;
        }
        if ((i & 2) != 0) {
            str2 = media.content_type;
        }
        if ((i & 4) != 0) {
            str3 = media.size;
        }
        if ((i & 8) != 0) {
            dimension = media.dimension;
        }
        if ((i & 16) != 0) {
            str4 = media.created_date;
        }
        if ((i & 32) != 0) {
            str5 = media.path;
        }
        if ((i & 64) != 0) {
            str6 = media.volume_name;
        }
        if ((i & 128) != 0) {
            byteString = media.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        return media.copy(str, str2, str3, dimension, str8, str9, str7, byteString2);
    }

    public final Media copy(String str, String str2, String str3, Dimension dimension, String str4, String str5, String str6, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Media(str, str2, str3, dimension, str4, str5, str6, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media media = (Media) obj;
        return j.b(unknownFields(), media.unknownFields()) && j.b(this.file_name, media.file_name) && j.b(this.content_type, media.content_type) && j.b(this.size, media.size) && j.b(this.dimension, media.dimension) && j.b(this.created_date, media.created_date) && j.b(this.path, media.path) && j.b(this.volume_name, media.volume_name);
    }

    public final String getContent_type() {
        return this.content_type;
    }

    public final String getCreated_date() {
        return this.created_date;
    }

    public final Dimension getDimension() {
        return this.dimension;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getVolume_name() {
        return this.volume_name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.file_name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.content_type;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.size;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Dimension dimension = this.dimension;
        int iHashCode5 = (iHashCode4 + (dimension != null ? dimension.hashCode() : 0)) * 37;
        String str4 = this.created_date;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.path;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.volume_name;
        int iHashCode8 = iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.file_name != null) {
            AbstractC1414e.p(this.file_name, new StringBuilder("file_name="), arrayList);
        }
        if (this.content_type != null) {
            AbstractC1414e.p(this.content_type, new StringBuilder("content_type="), arrayList);
        }
        if (this.size != null) {
            AbstractC1414e.p(this.size, new StringBuilder("size="), arrayList);
        }
        if (this.dimension != null) {
            arrayList.add("dimension=" + this.dimension);
        }
        if (this.created_date != null) {
            AbstractC1414e.p(this.created_date, new StringBuilder("created_date="), arrayList);
        }
        if (this.path != null) {
            AbstractC1414e.p(this.path, new StringBuilder("path="), arrayList);
        }
        if (this.volume_name != null) {
            AbstractC1414e.p(this.volume_name, new StringBuilder("volume_name="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "Media{", "}", null, 56);
    }

    public /* synthetic */ Media(String str, String str2, String str3, Dimension dimension, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : dimension, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Media(String str, String str2, String str3, Dimension dimension, String str4, String str5, String str6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.file_name = str;
        this.content_type = str2;
        this.size = str3;
        this.dimension = dimension;
        this.created_date = str4;
        this.path = str5;
        this.volume_name = str6;
    }
}
