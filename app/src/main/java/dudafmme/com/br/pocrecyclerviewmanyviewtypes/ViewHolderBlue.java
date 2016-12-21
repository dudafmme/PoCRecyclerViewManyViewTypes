package dudafmme.com.br.pocrecyclerviewmanyviewtypes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by eduana on 20/12/2016.
 */

public class ViewHolderBlue extends RecyclerView.ViewHolder {

    private TextView blueTextView;

    public ViewHolderBlue(View itemView) {
        super(itemView);
        blueTextView = (TextView) itemView.findViewById(R.id.blueLineTv);
    }

    public TextView getBlueTextView() {
        return blueTextView;
    }

    public void setRedTextView(TextView blueTextView) {
        this.blueTextView = blueTextView;
    }
}
