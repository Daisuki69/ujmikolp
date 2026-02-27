package com.tencent.youtu.sdkkitframework.liveness;

import android.content.Context;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class DetectOnlyState extends YtFSMBaseState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15889a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15890b = "";
    public boolean c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15891d = 80;
    public YTFaceTracker e;

    public class a extends HashMap<String, Object> {
        public a(DetectOnlyState detectOnlyState) {
            put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "检测初始化失败"));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        try {
            if (jSONObject.has("resource_online")) {
                this.f15889a = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.f15890b = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.c = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("min_face_size")) {
                this.f15891d = jSONObject.getInt("min_face_size");
            }
        } catch (Exception e) {
            YtLogger.e("DetectOnlyState", "Failed to parse json:", e);
        }
        if (!this.f15889a) {
            FileUtils.loadLibrary("YTFaceTracker");
        }
        Context context = YtFSM.getInstance().getContext().currentAppContext;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (this.f15889a) {
            absolutePath = this.f15890b;
            YtLogger.i("DetectOnlyState", "Use online path:" + absolutePath);
        } else {
            YtLogger.i("DetectOnlyState", "Use local path:" + absolutePath);
        }
        try {
            if (this.f15889a) {
                this.e = new YTFaceTracker(absolutePath, "config.ini");
            } else {
                this.e = new YTFaceTracker(context.getAssets(), "models/face-tracker-v001", "config.ini");
            }
            YTFaceTracker.Param param = this.e.getParam();
            YtLogger.i("DetectOnlyState", "big face mode" + this.c);
            param.biggerFaceMode = this.c ? 1 : 0;
            param.minFaceSize = this.f15891d;
            param.detInterval = -1;
            this.e.setParam(param);
            YtLogger.i("DetectOnlyState", "Detect version:" + YTFaceTracker.getVersion());
        } catch (Exception e7) {
            YtLogger.e("DetectOnlyState", "init YTFaceTracker error", e7);
            e7.printStackTrace();
            YtSDKStats.getInstance().reportError(1, "failed to init face trace sdk");
            YtFSM.getInstance().sendFSMEvent(new a(this));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j) {
        super.update(yTImageData, j);
    }
}
