package com.gtf.test.act;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.gtf.test.R;
import com.gtf.test.buildin.BaseFragment;
import com.gtf.test.utils.WarnUtils;

public class MainLeftFragment extends BaseFragment {
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.my_main_left, null);
	}

	private LinearLayout layoutMortgageCalculator;
	private LinearLayout layoutFeedback;
	private LinearLayout layoutAboutUs;
	private LinearLayout layoutCheckForUpdates;
	private LinearLayout layout_out;

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		this.initViews();
	}

	private void initViews() {
		View parent = this.getView();

		this.layoutMortgageCalculator = (LinearLayout) parent.findViewById(R.id.layout_mortgage_calculator);
		this.layoutFeedback = (LinearLayout) parent.findViewById(R.id.layout_feedback);
		this.layoutAboutUs = (LinearLayout) parent.findViewById(R.id.layout_about_us);
		this.layoutCheckForUpdates = (LinearLayout) parent.findViewById(R.id.layout_check_for_updates);

		this.layout_out = (LinearLayout) parent.findViewById(R.id.layout_out);

		this.layoutMortgageCalculator.setOnClickListener(this);
		this.layoutFeedback.setOnClickListener(this);
		this.layoutAboutUs.setOnClickListener(this);
		this.layoutCheckForUpdates.setOnClickListener(this);
		this.layout_out.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.layout_mortgage_calculator: {
			WarnUtils.toast(this.context, "系统设置");
			break;
		}
		case R.id.layout_feedback: {
			WarnUtils.toast(this.context, "意见反馈");
			break;
		}
		case R.id.layout_about_us: {
			WarnUtils.toast(this.context, "关于作者");
			break;
		}
		case R.id.layout_check_for_updates: {
			WarnUtils.toast(this.context, "退出");
			break;
		}
		/*case R.id.layout_out: {
			WarnUtils.toast(this.context, "其他");
			break;
		}*/
		}
	}
}
