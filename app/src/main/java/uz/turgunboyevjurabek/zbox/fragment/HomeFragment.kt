package uz.turgunboyevjurabek.zbox.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import uz.turgunboyevjurabek.zbox.R
import uz.turgunboyevjurabek.zbox.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding.btnDrawer.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }


        binding.btnProduct.setOnClickListener {
            findNavController().navigate(R.id.productFragment)
        }
//        binding.btn4.setOnClickListener {
//            findNavController().navigate(R.id.clientFragment)
//        }
//        binding.btn1.setOnClickListener {
//            findNavController().navigate(R.id.sellerFragment)
//        }
//        binding.btn2.setOnClickListener {
//            findNavController().navigate(R.id.orderFragment)
//        }



        // list finish
        return binding.root
    }

}