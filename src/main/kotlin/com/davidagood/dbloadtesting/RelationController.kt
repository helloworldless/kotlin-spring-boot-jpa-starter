package com.davidagood.dbloadtesting

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RelationController(@Autowired
                         val relationRepositry: RelationRepository) {

    @GetMapping("/relation")
    fun getAllRelations() = relationRepositry.findAll()

    @PostMapping("/relation")
    fun createRelation(@RequestParam("parent") parent: Int, @RequestParam("child") child: Int) {
        val relation = Relation(parentId = parent, childId = child)
        relationRepositry.save(relation)
    }

    @DeleteMapping("/relation")
    fun deleteAllRelations() {
        relationRepositry.deleteAll()
    }

    @PostMapping("/seed/{count}")
    fun seedRelations(@PathVariable(value = "count") count: Int) {
        val relations = IntRange(1, count).asIterable().map { Relation(parentId = it, childId = it + 1) }
        relationRepositry.saveAll(relations)
    }

}
