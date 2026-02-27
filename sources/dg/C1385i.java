package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Camera;
import dde.protobuf.fragments.Resolution;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: dg.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1385i extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5P"));
        long jBeginMessage = protoReader.beginMessage();
        Resolution resolutionDecode = null;
        Resolution resolutionDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Camera(resolutionDecode, resolutionDecode2, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                resolutionDecode = Resolution.ADAPTER.decode(protoReader);
            } else if (iNextTag == 2) {
                resolutionDecode2 = Resolution.ADAPTER.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayListJ.add(Resolution.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Camera camera = (Camera) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5b"));
        kotlin.jvm.internal.j.g(camera, numX49.tnTj78("bd52"));
        ProtoAdapter<Resolution> protoAdapter = Resolution.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, camera.getMaxResolution());
        protoAdapter.encodeWithTag(protoWriter, 2, camera.getDefaultResolution());
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, camera.getSupportedResolutions());
        protoWriter.writeBytes(camera.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Camera camera = (Camera) obj;
        kotlin.jvm.internal.j.g(camera, numX49.tnTj78("bd5Z"));
        int size = camera.unknownFields().size();
        ProtoAdapter<Resolution> protoAdapter = Resolution.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, camera.getSupportedResolutions()) + protoAdapter.encodedSizeWithTag(2, camera.getDefaultResolution()) + protoAdapter.encodedSizeWithTag(1, camera.getMaxResolution()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Camera camera = (Camera) obj;
        kotlin.jvm.internal.j.g(camera, numX49.tnTj78("bd5k"));
        Resolution maxResolution = camera.getMaxResolution();
        Resolution resolutionRedact = maxResolution != null ? Resolution.ADAPTER.redact(maxResolution) : null;
        Resolution defaultResolution = camera.getDefaultResolution();
        return camera.copy(resolutionRedact, defaultResolution != null ? Resolution.ADAPTER.redact(defaultResolution) : null, Internal.m186redactElements(camera.getSupportedResolutions(), Resolution.ADAPTER), ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Camera camera = (Camera) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5L"));
        kotlin.jvm.internal.j.g(camera, numX49.tnTj78("bd5r"));
        reverseProtoWriter.writeBytes(camera.unknownFields());
        ProtoAdapter<Resolution> protoAdapter = Resolution.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, camera.getSupportedResolutions());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, camera.getDefaultResolution());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, camera.getMaxResolution());
    }
}
