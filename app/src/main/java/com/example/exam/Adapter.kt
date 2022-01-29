package com.example.exam

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.databinding.RecyclerviewItemBinding

class Adapter(
    var personsList: MutableList<Person>
    ) :
    RecyclerView.Adapter<Adapter.PersonsHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonsHolder {
        val binding = RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonsHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonsHolder, position: Int) {
        val person = personsList[position]
        holder.bind(person)
    }

    override fun getItemCount(): Int {
        return personsList.size
    }

    inner class PersonsHolder internal constructor(
        private val binding: RecyclerviewItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(person: Person) = binding.run {
            name.text = person.name
            surname.text = person.surname
            minimalInfo.text = person.minimalInfo
            photo.setImageResource(person.pictureRes)


        }
    }
}