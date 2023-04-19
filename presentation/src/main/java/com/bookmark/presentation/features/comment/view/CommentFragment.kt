package com.bookmark.presentation.features.comment.view

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bookmark.presentation.base.BaseFragment
import com.bookmark.presentation.databinding.FragmentCommentBinding
import com.bookmark.presentation.features.comment.adapter.CommentAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class CommentFragment : BaseFragment<FragmentCommentBinding,CommentViewModel>(), CommentAdapter.CallBack
/*class CommentFragment() : BaseFragment<FragmentCommentBinding, CommentViewModel>(), CommentAdapter.CallBack {
    override val viewModel : CommentViewModel by viewModels()
    private val adapter = CommentAdapter(this)

    private val args: CommentFragmentArgs by navArgs()

    override fun onStart() {
        super.onStart()
        viewModel.getComment(args.bookId)
        binding.rvComment.adapter = adapter
        binding.rvComment.layoutManager =LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
    }

    override fun observerViewModel() {
        binding.btnComment.setOnClickListener{
            viewModel.addComment(args.bookId)
        }

        with(viewModel){
            commentList.observe(
                viewLifecycleOwner,
                Observer<List<Comment>> {
                    Log.e("LibraryFragment", it.toString())
                    adapter.submitList(it)
                }
            )
        }
    }

    override fun deleteComment(info: Comment) {
        viewModel.deleteComment(info.bookId, info.id)
    }
}*/