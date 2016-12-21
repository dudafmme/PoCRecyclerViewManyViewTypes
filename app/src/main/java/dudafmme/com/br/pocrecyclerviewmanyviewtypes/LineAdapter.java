package dudafmme.com.br.pocrecyclerviewmanyviewtypes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by eduana on 19/12/2016.
 */

public class LineAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Item> itemList;

    private final int USER = 0, AGENT = 1;
    private static final String USER_TYPE = "USER";
    private static final String AGENT_TYPE = "AGENT";
    private View view;
    RecyclerView.ViewHolder viewHolder;


    public LineAdapter(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (itemList.get(position).getType().equals(USER_TYPE)) {
            return USER;
        } else if (itemList.get(position).getType().equals(AGENT_TYPE)) {
            return AGENT;
        }
        return -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        view = inflater.inflate(R.layout.line_red_adapter, parent, false);
        viewHolder = new ViewHolderRed(view);

        switch (viewType) {
            case USER:
                view = inflater.inflate(R.layout.line_red_adapter, parent, false);
                viewHolder = new ViewHolderRed(view);
                break;
            case AGENT:
                view = inflater.inflate(R.layout.line_blue_adapter, parent, false);
                viewHolder = new ViewHolderBlue(view);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case USER:
                ViewHolderRed vh1 = (ViewHolderRed) holder;
                setViewHolderRed(vh1, position);
                break;
            case AGENT:
                ViewHolderBlue vh2 = (ViewHolderBlue) holder;
                setViewHolderBlue(vh2, position);
                break;
            default:
                break;
        }
    }

    private void setViewHolderRed(ViewHolderRed vh1, int position) {
        Item item = itemList.get(position);
        if (item != null) {
            vh1.getRedTextView().setText(USER_TYPE);
        }
    }

    private void setViewHolderBlue(ViewHolderBlue vh2, int position) {
        Item item = itemList.get(position);
        if (item != null) {
            vh2.getBlueTextView().setText(AGENT_TYPE);
        }
    }
}