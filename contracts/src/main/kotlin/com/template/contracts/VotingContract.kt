package com.template.contracts


import net.corda.core.contracts.CommandData
import net.corda.core.contracts.Contract
import net.corda.core.transactions.LedgerTransaction

// ************
// * Contract *
// ************
class VotingContract : Contract {
    companion object {
        // Used to identify our contract when building a transaction.
        const val ID = "com.template.contracts.VotingContract"
    }

    // A transaction is valid if the verify() function of the contract of all the transaction's input and output states
    // does not throw an exception.
    override fun verify(tx: LedgerTransaction) {
        // Verification logic goes here.
//        val command = tx.commands.requireSingleCommand<Commands>().value
//        when(command) {
//            is Commands.Issue -> requireThat
//            {
//                "There should be no input state" using (tx.inputs.isEmpty())
//                "There should be one input state" using (tx.outputs.size == 1)
//                "The output state must be of type CarState" using (tx.outputs.get(0).data is CommercialPaperState)
//                val outputState = tx.outputs.get(0).data as CommercialPaperState
//                "The licensePlateNumber must be seven characters long" using (outputState.licensePlateNumber.length == 7)
//            }
//        }
    }

    // Used to indicate the transaction's intent.
    interface Commands : CommandData {
        // Issue a new EUC.
        class CastVote : Commands
    }
}