package com.marcbits.top10downloader;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by marc on 2/15/17
 * for MarcBits
 * Contact: marcbits_at_outlook_dot_com
 */

public class FeedAdapter<T extends FeedEntry> extends ArrayAdapter {
    private static final String TAG = "FeedAdapter";

    private final int mLayoutResource;
    private final LayoutInflater mLayoutInflater;
    private List<T> mApplications;

    public FeedAdapter(Context pContext, int pResource, List<T> pApplications) {
        super(pContext, pResource);
        this.mLayoutResource = pResource;
        this.mLayoutInflater = LayoutInflater.from(pContext);
        this.mApplications = pApplications;
    }

    @Override
    public int getCount() {
        return this.mApplications.size();
    }

    @NonNull
    @Override
    public View getView(int pPosition, View pConvertView, ViewGroup pParent) {
        ViewHolder viewHolder;

        // If there is no view to reuse, create a new one.
        if (pConvertView == null) {
            pConvertView = mLayoutInflater.inflate(mLayoutResource, pParent, false);

            viewHolder = new ViewHolder(pConvertView);
            pConvertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) pConvertView.getTag();
        }

        T currentApp = mApplications.get(pPosition);

        viewHolder.tvName.setText(currentApp.getName());
        viewHolder.tvArtist.setText(currentApp.getArtist());
        viewHolder.tvSummary.setText(currentApp.getSummary());

        return pConvertView;
    }

    private class ViewHolder {
        final TextView tvName;
        final TextView tvArtist;
        final TextView tvSummary;

        ViewHolder(View v) {
            this.tvName = (TextView) v.findViewById(R.id.tvName);
            this.tvArtist = (TextView) v.findViewById(R.id.tvArtist);
            this.tvSummary = (TextView) v.findViewById(R.id.tvSummary);
        }
    }
}
