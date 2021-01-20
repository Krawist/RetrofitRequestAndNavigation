package cm.seeds.retrofitrequestandnavigation.home.fragment.First

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import cm.seeds.retrofitrequestandnavigation.R
import cm.seeds.retrofitrequestandnavigation.databinding.FragmentFirstBinding
import cm.seeds.retrofitrequestandnavigation.retrofit.Status
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.coroutines.flow.collect

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private lateinit var dataBinding : FragmentFirstBinding
    private lateinit var model : FirstFragmentViewModel
    private var adapterImage : AdapterImage? = null
    private var loadingDialog : Dialog? = null

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         dataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false)
            model = ViewModelProviders.of(this).get(FirstFragmentViewModel::class.java)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataBinding.recyclerview.layoutManager = GridLayoutManager(requireContext(),2)
        adapterImage = AdapterImage()

        dataBinding.recyclerview.adapter = adapterImage

        lifecycleScope.launchWhenResumed {
            model.imagesLiveData?.observe(viewLifecycleOwner, {
                when(it.status){

                    Status.ERROR -> {
                        loadingDialog?.dismiss()
/*                        MaterialAlertDialogBuilder(requireContext())
                            .setMessage(it.message)
                            .show()*/
                    }

                    Status.LOADING -> {
                        loadingDialog = Dialog(requireContext())
                        loadingDialog?.setCancelable(false)
                        loadingDialog?.setContentView(R.layout.loading_dialog_layout)
                        loadingDialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
                        loadingDialog?.show()
                    }

                    Status.SUCCESS ->{
                        loadingDialog?.dismiss()
                        adapterImage?.submitList(it.data)
                        model.saveImage(it.data)
                    }

                }
            })
        }
    }
}