import { Process } from './process';
import { Company } from './company';
import { Expense } from './expense';
import { User } from './user';
import { Wallet } from './wallet';

export class DocSend {
    process: Process;
    company: Company;
    expense: Expense;
    user: User;
    wallet: Wallet;
    lot: string;
    cpf: string;
}

